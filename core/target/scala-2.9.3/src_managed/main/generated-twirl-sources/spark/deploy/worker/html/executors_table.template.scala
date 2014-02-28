
package spark.deploy.worker.html

import twirl.api._
import TemplateMagic._


/**/
object executors_table extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template1[List[spark.deploy.worker.ExecutorRunner],twirl.api.Html] {

    /**/
    def apply/*1.2*/(executors: List[spark.deploy.worker.ExecutorRunner]):twirl.api.Html = {
        _display_ {

Seq(format.raw/*1.55*/("""

<table class="table table-bordered table-striped table-condensed sortable">
  <thead>
    <tr>
      <th>ExecutorID</th>
      <th>Cores</th>
      <th>Memory</th>
      <th>Job Details</th>
      <th>Logs</th>
    </tr>
  </thead>
  <tbody>
    """),_display_(Seq(/*14.6*/for(e <- executors) yield /*14.25*/ {_display_(Seq(format.raw/*14.27*/("""
      """),_display_(Seq(/*15.8*/executor_row(e))),format.raw/*15.23*/("""
    """)))})),format.raw/*16.6*/("""
  </tbody>
</table>"""))}
    }

    def render(executors:List[spark.deploy.worker.ExecutorRunner]) = apply(executors)

    def f:((List[spark.deploy.worker.ExecutorRunner]) => twirl.api.Html) = (executors) => apply(executors)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/deploy/worker/executors_table.scala.html
                    HASH: 63853273a5704b8a1b48780cc3422366872c4bed
                    MATRIX: 308->1|424->54|703->303|738->322|773->324|811->332|848->347|885->353
                    LINES: 12->1|15->1|28->14|28->14|28->14|29->15|29->15|30->16
                    -- GENERATED --
                */
            