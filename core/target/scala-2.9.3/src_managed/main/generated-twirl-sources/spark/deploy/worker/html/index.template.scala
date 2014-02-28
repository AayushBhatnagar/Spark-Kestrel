
package spark.deploy.worker.html

import twirl.api._
import TemplateMagic._


/**/
object index extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template1[spark.deploy.WorkerState,twirl.api.Html] {

    /**/
    def apply/*1.2*/(worker: spark.deploy.WorkerState):twirl.api.Html = {
        _display_ {import spark.Utils


Seq(format.raw/*1.36*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq(/*4.2*/spark/*4.7*/.common.html.layout(title = "Spark Worker on " + worker.host)/*4.68*/ {_display_(Seq(format.raw/*4.70*/("""

  <!-- Worker Details -->
  <div class="row">
    <div class="span12">
      <ul class="unstyled">
        <li><strong>ID:</strong> """),_display_(Seq(/*10.35*/worker/*10.41*/.workerId)),format.raw/*10.50*/("""</li>
        <li><strong>
          Master URL:</strong> """),_display_(Seq(/*12.33*/worker/*12.39*/.masterUrl)),format.raw/*12.49*/(""" 
        </li>
        <li><strong>Cores:</strong> """),_display_(Seq(/*14.38*/worker/*14.44*/.cores)),format.raw/*14.50*/(""" ("""),_display_(Seq(/*14.53*/worker/*14.59*/.coresUsed)),format.raw/*14.69*/(""" Used)</li>
        <li><strong>Memory:</strong> """),_display_(Seq(/*15.39*/{Utils.memoryMegabytesToString(worker.memory)})),format.raw/*15.85*/("""
          ("""),_display_(Seq(/*16.13*/{Utils.memoryMegabytesToString(worker.memoryUsed)})),format.raw/*16.63*/(""" Used)</li>
      </ul>
      <p><a href=""""),_display_(Seq(/*18.20*/worker/*18.26*/.masterWebUiUrl)),format.raw/*18.41*/("""">Back to Master</a></p>
    </div>
  </div>

  <hr/>

  <!-- Running Executors -->
  <div class="row">
    <div class="span12">
      <h3> Running Executors </h3>
      <br/>
      """),_display_(Seq(/*29.8*/executors_table(worker.executors))),format.raw/*29.41*/("""
    </div>
  </div>

  <hr/>

  <!-- Finished Executors  -->
  <div class="row">
    <div class="span12">
      <h3> Finished Executors </h3>
      <br/>
      """),_display_(Seq(/*40.8*/executors_table(worker.finishedExecutors))),format.raw/*40.49*/("""
    </div>
  </div>
      
""")))})),format.raw/*44.2*/("""
"""))}
    }

    def render(worker:spark.deploy.WorkerState) = apply(worker)

    def f:((spark.deploy.WorkerState) => twirl.api.Html) = (worker) => apply(worker)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/deploy/worker/index.scala.html
                    HASH: cce4f6c03d3a619879e5adca1a927f5abbac54e7
                    MATRIX: 282->1|398->35|425->56|456->58|468->63|537->124|571->126|737->261|752->267|783->276|873->335|888->341|920->351|1004->404|1019->410|1047->416|1081->419|1096->425|1128->435|1209->485|1277->531|1321->544|1393->594|1467->637|1482->643|1519->658|1732->841|1787->874|1979->1036|2042->1077|2102->1106
                    LINES: 12->1|16->1|17->3|18->4|18->4|18->4|18->4|24->10|24->10|24->10|26->12|26->12|26->12|28->14|28->14|28->14|28->14|28->14|28->14|29->15|29->15|30->16|30->16|32->18|32->18|32->18|43->29|43->29|54->40|54->40|58->44
                    -- GENERATED --
                */
            