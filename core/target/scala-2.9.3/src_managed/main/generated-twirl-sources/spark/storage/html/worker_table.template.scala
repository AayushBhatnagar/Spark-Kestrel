
package spark.storage.html

import twirl.api._
import TemplateMagic._


/**/
object worker_table extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template2[Array[spark.storage.StorageStatus],String,twirl.api.Html] {

    /**/
    def apply/*1.2*/(workersStatusList: Array[spark.storage.StorageStatus], prefix: String = ""):twirl.api.Html = {
        _display_ {import spark.Utils


Seq(format.raw/*1.78*/("""
"""),format.raw/*3.1*/("""
<table class="table table-bordered table-striped table-condensed sortable">
  <thead>
    <tr>
      <th>Host</th>
      <th>Memory Usage</th>
      <th>Disk Usage</th>
    </tr>
  </thead>
  <tbody>
    """),_display_(Seq(/*13.6*/for(status <- workersStatusList) yield /*13.38*/ {_display_(Seq(format.raw/*13.40*/("""
      <tr>
        <td>"""),_display_(Seq(/*15.14*/(status.blockManagerId.ip + ":" + status.blockManagerId.port))),format.raw/*15.75*/("""</td>
        <td>
          """),_display_(Seq(/*17.12*/(Utils.memoryBytesToString(status.memUsed(prefix))))),format.raw/*17.63*/("""
          ("""),_display_(Seq(/*18.13*/(Utils.memoryBytesToString(status.memRemaining)))),format.raw/*18.61*/(""" Total Available)
        </td>
        <td>"""),_display_(Seq(/*20.14*/(Utils.memoryBytesToString(status.diskUsed(prefix))))),format.raw/*20.66*/("""</td>
    </tr>
    """)))})),format.raw/*22.6*/("""
  </tbody>
</table>"""))}
    }

    def render(workersStatusList:Array[spark.storage.StorageStatus],prefix:String) = apply(workersStatusList,prefix)

    def f:((Array[spark.storage.StorageStatus],String) => twirl.api.Html) = (workersStatusList,prefix) => apply(workersStatusList,prefix)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/storage/worker_table.scala.html
                    HASH: c4f4f981c520afc27857bfcd937476f5a99c9ae9
                    MATRIX: 300->1|458->77|485->98|721->304|769->336|804->338|860->363|943->424|1004->454|1077->505|1121->518|1191->566|1267->611|1341->663|1393->684
                    LINES: 12->1|16->1|17->3|27->13|27->13|27->13|29->15|29->15|31->17|31->17|32->18|32->18|34->20|34->20|36->22
                    -- GENERATED --
                */
            