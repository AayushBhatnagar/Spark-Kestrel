
package spark.storage.html

import twirl.api._
import TemplateMagic._


/**/
object rdd extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template2[spark.storage.RDDInfo,Array[spark.storage.StorageStatus],twirl.api.Html] {

    /**/
    def apply/*1.2*/(rddInfo: spark.storage.RDDInfo, storageStatusList: Array[spark.storage.StorageStatus]):twirl.api.Html = {
        _display_ {import spark.Utils


Seq(format.raw/*1.89*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq(/*4.2*/spark/*4.7*/.common.html.layout(title = "RDD Info ")/*4.47*/ {_display_(Seq(format.raw/*4.49*/("""
  
  <!-- High-Level Information -->
  <div class="row">
    <div class="span12">
      <ul class="unstyled">
        <li>
          <strong>Storage Level:</strong> 
          """),_display_(Seq(/*12.12*/(rddInfo.storageLevel.description))),format.raw/*12.46*/("""
        <li>
          <strong>Cached Partitions:</strong>
          """),_display_(Seq(/*15.12*/(rddInfo.numCachedPartitions))),format.raw/*15.41*/("""
        </li>
        <li>
          <strong>Total Partitions:</strong>
          """),_display_(Seq(/*19.12*/(rddInfo.numPartitions))),format.raw/*19.35*/("""
        </li>
        <li>
          <strong>Memory Size:</strong>
          """),_display_(Seq(/*23.12*/{Utils.memoryBytesToString(rddInfo.memSize)})),format.raw/*23.56*/("""
        </li>
        <li>
          <strong>Disk Size:</strong>
          """),_display_(Seq(/*27.12*/{Utils.memoryBytesToString(rddInfo.diskSize)})),format.raw/*27.57*/("""
        </li>
      </ul>
    </div>
  </div>

  <hr/>

  <!-- RDD Summary -->
  <div class="row">
    <div class="span12">
      <h3> RDD Summary </h3>
      <br/>
      

      <!-- Block Table Summary -->
      <table class="table table-bordered table-striped table-condensed sortable">
        <thead>
          <tr>
            <th>Block Name</th>
            <th>Storage Level</th>
            <th>Size in Memory</th>
            <th>Size on Disk</th>
          </tr>
        </thead>
        <tbody>
          """),_display_(Seq(/*53.12*/storageStatusList/*53.29*/.flatMap(_.blocks).toArray.sortWith(_._1 < _._1).map/*53.81*/ { case (k,v) =>_display_(Seq(format.raw/*53.97*/(""" 
            <tr>
              <td>"""),_display_(Seq(/*55.20*/k)),format.raw/*55.21*/("""</td>
              <td>
                 """),_display_(Seq(/*57.19*/(v.storageLevel.description))),format.raw/*57.47*/("""
              </td>
              <td>"""),_display_(Seq(/*59.20*/{Utils.memoryBytesToString(v.memSize)})),format.raw/*59.58*/("""</td>
              <td>"""),_display_(Seq(/*60.20*/{Utils.memoryBytesToString(v.diskSize)})),format.raw/*60.59*/("""</td>
            </tr>
          """)))})),format.raw/*62.12*/("""
        </tbody>
      </table>


    </div>
  </div>

  <hr/>

  <!-- Worker Table -->
  <div class="row">
    <div class="span12">
      <h3> Worker Summary </h3>
      <br/>
       """),_display_(Seq(/*77.9*/worker_table(storageStatusList, "rdd_" + rddInfo.id ))),format.raw/*77.62*/("""
    </div>
  </div>

""")))})))}
    }

    def render(rddInfo:spark.storage.RDDInfo,storageStatusList:Array[spark.storage.StorageStatus]) = apply(rddInfo,storageStatusList)

    def f:((spark.storage.RDDInfo,Array[spark.storage.StorageStatus]) => twirl.api.Html) = (rddInfo,storageStatusList) => apply(rddInfo,storageStatusList)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/storage/rdd.scala.html
                    HASH: d938f9840fac6458f6ffe96593b37e30f787f5c0
                    MATRIX: 306->1|475->88|502->109|533->111|545->116|593->156|627->158|836->336|892->370|994->441|1045->470|1160->554|1205->577|1315->656|1381->700|1489->777|1556->822|2106->1341|2132->1358|2193->1410|2242->1426|2311->1464|2334->1465|2408->1508|2458->1536|2529->1576|2589->1614|2645->1639|2706->1678|2773->1713|2989->1899|3064->1952
                    LINES: 12->1|16->1|17->3|18->4|18->4|18->4|18->4|26->12|26->12|29->15|29->15|33->19|33->19|37->23|37->23|41->27|41->27|67->53|67->53|67->53|67->53|69->55|69->55|71->57|71->57|73->59|73->59|74->60|74->60|76->62|91->77|91->77
                    -- GENERATED --
                */
            