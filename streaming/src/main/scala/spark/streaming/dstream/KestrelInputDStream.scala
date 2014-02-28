package spark.streaming.dstream

import spark.Logging
import spark.storage.StorageLevel
import spark.streaming.{ Time, DStreamCheckpointData, StreamingContext }

import com.twitter.finagle.builder.ClientBuilder
import com.twitter.finagle.kestrel.protocol.Kestrel
import com.twitter.finagle.kestrel.{ ReadHandle, Client }
import org.jboss.netty.util.CharsetUtil


private[streaming]
class KestrelInputDStream[T: ClassManifest](
  @transient ssc_ : StreamingContext,
  host: String,
  queueName: String,

  storageLevel: StorageLevel) extends NetworkInputDStream[T](ssc_) with Logging {

  def getReceiver(): NetworkReceiver[T] = {
    new KestrelReceiver(host, queueName, storageLevel)
      .asInstanceOf[NetworkReceiver[T]]
  }
}

private[streaming]
class KestrelReceiver(host: String,
  queueName: String,
  storageLevel: StorageLevel) extends NetworkReceiver[Any] {

  lazy protected val blockGenerator = new BlockGenerator(storageLevel)

  def onStop() {
    blockGenerator.stop()
  }

  def onStart() {

    blockGenerator.start()

    val hosts = Seq(host)

    val clients: Seq[Client] = hosts map { host =>
      Client(ClientBuilder()
        .codec(Kestrel())
        .hosts(host)
        .hostConnectionLimit(1) // process at most 1 item per connection concurrently
        .buildFactory())
    }

    val readHandles: Seq[ReadHandle] = {
      clients map { _.readReliably(queueName) }
    }

    val readHandle: ReadHandle = ReadHandle.merged(readHandles)

    // Attach an async error handler that prints to stderr
    readHandle.error foreach { e =>
      System.err.println("zomg! got an error " + e)
    }

    // Attach an async message handler that prints the messages to stdout
    readHandle.messages foreach { msg =>
      try {
        blockGenerator += msg.bytes.toString(CharsetUtil.UTF_8)
      } finally {
        msg.ack.sync() // if we don't do this, no more msgs will come to us
      }
    }

  }

}
