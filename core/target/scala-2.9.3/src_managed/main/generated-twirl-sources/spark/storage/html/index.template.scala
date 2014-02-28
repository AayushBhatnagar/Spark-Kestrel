
package spark.storage.html

import twirl.api._
import TemplateMagic._


/**/
object index extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template5[Long,Long,Long,Array[spark.storage.RDDInfo],Array[spark.storage.StorageStatus],twirl.api.Html] {

    /**/
    def apply/*1.2*/(maxMem: Long, remainingMem: Long, diskSpaceUsed: Long, rdds: Array[spark.storage.RDDInfo], storageStatusList: Array[spark.storage.StorageStatus]):twirl.api.Html = {
        _display_ {import spark.Utils


Seq(format.raw/*1.148*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq(/*4.2*/spark/*4.7*/.common.html.layout(title = "Storage Dashboard")/*4.55*/ {_display_(Seq(format.raw/*4.57*/("""
  
  <!-- High-Level Information -->
  <div class="row">
    <div class="span12">
      <ul class="unstyled">
        <li><strong>Memory:</strong> 
          """),_display_(Seq(/*11.12*/{Utils.memoryBytesToString(maxMem - remainingMem)})),format.raw/*11.62*/(""" Used 
          ("""),_display_(Seq(/*12.13*/{Utils.memoryBytesToString(remainingMem)})),format.raw/*12.54*/(""" Available) </li>
        <li><strong>Disk:</strong> """),_display_(Seq(/*13.37*/{Utils.memoryBytesToString(diskSpaceUsed)})),format.raw/*13.79*/(""" Used </li>
      </ul>
    </div>
  </div>

  <hr/>

  <!-- RDD Summary -->
  <div class="row">
    <div class="span12">
      <h3> RDD Summary </h3>
      <br/>
       """),_display_(Seq(/*25.9*/rdd_table(rdds))),format.raw/*25.24*/("""
    </div>
  </div>

  <hr/>

  <!-- Worker Summary -->
  <div class="row">
    <div class="span12">
      <h3> Worker Summary </h3>
      <br/>
       """),_display_(Seq(/*36.9*/worker_table(storageStatusList))),format.raw/*36.40*/("""
    </div>
  </div>

""")))})))}
    }

    def render(maxMem:Long,remainingMem:Long,diskSpaceUsed:Long,rdds:Array[spark.storage.RDDInfo],storageStatusList:Array[spark.storage.StorageStatus]) = apply(maxMem,remainingMem,diskSpaceUsed,rdds,storageStatusList)

    def f:((Long,Long,Long,Array[spark.storage.RDDInfo],Array[spark.storage.StorageStatus]) => twirl.api.Html) = (maxMem,remainingMem,diskSpaceUsed,rdds,storageStatusList) => apply(maxMem,remainingMem,diskSpaceUsed,rdds,storageStatusList)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/storage/index.scala.html
                    HASH: 41e2f5d261267c120882e60081c4aeb43f72ef01
                    MATRIX: 330->1|559->147|586->168|617->170|629->175|685->223|719->225|910->385|982->435|1032->454|1095->495|1180->549|1244->591|1445->762|1482->777|1666->931|1719->962
                    LINES: 12->1|16->1|17->3|18->4|18->4|18->4|18->4|25->11|25->11|26->12|26->12|27->13|27->13|39->25|39->25|50->36|50->36
                    -- GENERATED --
                */
            