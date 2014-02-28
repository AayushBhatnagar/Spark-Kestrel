
package spark.deploy.master.html

import twirl.api._
import TemplateMagic._


/**/
object index extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template1[spark.deploy.MasterState,twirl.api.Html] {

    /**/
    def apply/*1.2*/(state: spark.deploy.MasterState):twirl.api.Html = {
        _display_ {import spark.deploy.master._

import spark.Utils


Seq(format.raw/*1.35*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq(/*5.2*/spark/*5.7*/.common.html.layout(title = "Spark Master on " + state.host)/*5.67*/ {_display_(Seq(format.raw/*5.69*/("""

  <!-- Cluster Details -->
  <div class="row">
    <div class="span12">
      <ul class="unstyled">
        <li><strong>URL:</strong> """),_display_(Seq(/*11.36*/(state.uri))),format.raw/*11.47*/("""</li>
        <li><strong>Workers:</strong> """),_display_(Seq(/*12.40*/state/*12.45*/.workers.size)),format.raw/*12.58*/(""" </li>
        <li><strong>Cores:</strong> """),_display_(Seq(/*13.38*/{state.workers.map(_.cores).sum})),format.raw/*13.70*/(""" Total,
                                    """),_display_(Seq(/*14.38*/{state.workers.map(_.coresUsed).sum})),format.raw/*14.74*/(""" Used</li>
        <li><strong>Memory:</strong> """),_display_(Seq(/*15.39*/{Utils.memoryMegabytesToString(state.workers.map(_.memory).sum)})),format.raw/*15.103*/(""" Total, 
                                     """),_display_(Seq(/*16.39*/{Utils.memoryMegabytesToString(state.workers.map(_.memoryUsed).sum)})),format.raw/*16.107*/(""" Used</li>
        <li><strong>Applications:</strong> """),_display_(Seq(/*17.45*/state/*17.50*/.activeApps.size)),format.raw/*17.66*/(""" Running, """),_display_(Seq(/*17.77*/state/*17.82*/.completedApps.size)),format.raw/*17.101*/(""" Completed </li>
      </ul>
    </div>
  </div>

  <!-- Worker Summary -->
  <div class="row">
    <div class="span12">
      <h3> Workers </h3>
      <br/>
      """),_display_(Seq(/*27.8*/worker_table(state.workers.sortBy(_.id)))),format.raw/*27.48*/("""
    </div>
  </div>

  <hr/>

  <!-- App Summary (Running) -->
  <div class="row">
    <div class="span12">
      <h3> Running Applications </h3>
      <br/>
      """),_display_(Seq(/*38.8*/app_table(state.activeApps.sortBy(_.startTime).reverse))),format.raw/*38.63*/("""
    </div>
  </div>

  <hr/>

  <!-- App Summary (Completed) -->
  <div class="row">
    <div class="span12">
      <h3> Completed Applications </h3>
      <br/>
      """),_display_(Seq(/*49.8*/app_table(state.completedApps.sortBy(_.endTime).reverse))),format.raw/*49.64*/("""
    </div>
  </div>

""")))})),format.raw/*53.2*/("""
"""))}
    }

    def render(state:spark.deploy.MasterState) = apply(state)

    def f:((spark.deploy.MasterState) => twirl.api.Html) = (state) => apply(state)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/deploy/master/index.scala.html
                    HASH: 565aa5e4742fae0af8909c7dcecbc673208d4ea8
                    MATRIX: 282->1|427->34|454->85|485->87|497->92|565->152|599->154|767->291|800->302|876->347|890->352|925->365|1000->409|1054->441|1130->486|1188->522|1268->571|1355->635|1433->682|1524->750|1610->805|1624->810|1662->826|1704->837|1718->842|1760->861|1955->1026|2017->1066|2213->1232|2290->1287|2490->1457|2568->1513|2622->1536
                    LINES: 12->1|18->1|19->4|20->5|20->5|20->5|20->5|26->11|26->11|27->12|27->12|27->12|28->13|28->13|29->14|29->14|30->15|30->15|31->16|31->16|32->17|32->17|32->17|32->17|32->17|32->17|42->27|42->27|53->38|53->38|64->49|64->49|68->53
                    -- GENERATED --
                */
            