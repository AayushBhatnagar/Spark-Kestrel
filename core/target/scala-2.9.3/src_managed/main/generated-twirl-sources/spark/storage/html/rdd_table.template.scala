
package spark.storage.html

import twirl.api._
import TemplateMagic._


/**/
object rdd_table extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template1[Array[spark.storage.RDDInfo],twirl.api.Html] {

    /**/
    def apply/*1.2*/(rdds: Array[spark.storage.RDDInfo]):twirl.api.Html = {
        _display_ {import spark.Utils


Seq(format.raw/*1.38*/("""
"""),format.raw/*3.1*/("""
<table class="table table-bordered table-striped table-condensed sortable">
  <thead>
    <tr>
      <th>RDD Name</th>
      <th>Storage Level</th>
      <th>Cached Partitions</th>
      <th>Fraction Partitions Cached</th>
      <th>Size in Memory</th>
      <th>Size on Disk</th>
    </tr>
  </thead>
  <tbody>
    """),_display_(Seq(/*16.6*/for(rdd <- rdds) yield /*16.22*/ {_display_(Seq(format.raw/*16.24*/("""
      <tr>
        <td>
          <a href="rdd?id="""),_display_(Seq(/*19.28*/(rdd.id))),format.raw/*19.36*/("""">
            """),_display_(Seq(/*20.14*/rdd/*20.17*/.name)),format.raw/*20.22*/("""
          </a>
        </td>
        <td>"""),_display_(Seq(/*23.14*/(rdd.storageLevel.description))),format.raw/*23.44*/("""
        </td>
        <td>"""),_display_(Seq(/*25.14*/rdd/*25.17*/.numCachedPartitions)),format.raw/*25.37*/("""</td>
        <td>"""),_display_(Seq(/*26.14*/(rdd.numCachedPartitions / rdd.numPartitions.toDouble))),format.raw/*26.68*/("""</td>
        <td>"""),_display_(Seq(/*27.14*/{Utils.memoryBytesToString(rdd.memSize)})),format.raw/*27.54*/("""</td>
        <td>"""),_display_(Seq(/*28.14*/{Utils.memoryBytesToString(rdd.diskSize)})),format.raw/*28.55*/("""</td>
      </tr>
    """)))})),format.raw/*30.6*/("""
  </tbody>
</table>"""))}
    }

    def render(rdds:Array[spark.storage.RDDInfo]) = apply(rdds)

    def f:((Array[spark.storage.RDDInfo]) => twirl.api.Html) = (rdds) => apply(rdds)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/storage/rdd_table.scala.html
                    HASH: 512045c24c9cb0f5486d3abcdb6c5bf302f1abad
                    MATRIX: 284->1|402->37|429->58|777->376|809->392|844->394|927->446|957->454|1004->470|1016->473|1043->478|1117->521|1169->551|1228->579|1240->582|1282->602|1332->621|1408->675|1458->694|1520->734|1570->753|1633->794|1687->817
                    LINES: 12->1|16->1|17->3|30->16|30->16|30->16|33->19|33->19|34->20|34->20|34->20|37->23|37->23|39->25|39->25|39->25|40->26|40->26|41->27|41->27|42->28|42->28|44->30
                    -- GENERATED --
                */
            