
package spark.deploy.master.html

import twirl.api._
import TemplateMagic._


/**/
object worker_table extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template1[Array[spark.deploy.master.WorkerInfo],twirl.api.Html] {

    /**/
    def apply/*1.2*/(workers: Array[spark.deploy.master.WorkerInfo]):twirl.api.Html = {
        _display_ {

Seq(format.raw/*1.50*/("""

<table class="table table-bordered table-striped table-condensed sortable">
  <thead>
    <tr>
      <th>ID</th>
      <th>Address</th>
      <th>State</th>
      <th>Cores</th>
      <th>Memory</th>
    </tr>
  </thead>
  <tbody>
    """),_display_(Seq(/*14.6*/for(w <- workers) yield /*14.23*/ {_display_(Seq(format.raw/*14.25*/("""
      """),_display_(Seq(/*15.8*/worker_row(w))),format.raw/*15.21*/("""
    """)))})),format.raw/*16.6*/("""
  </tbody>
</table>
"""))}
    }

    def render(workers:Array[spark.deploy.master.WorkerInfo]) = apply(workers)

    def f:((Array[spark.deploy.master.WorkerInfo]) => twirl.api.Html) = (workers) => apply(workers)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/deploy/master/worker_table.scala.html
                    HASH: 5beb52a03cb90d71da2a0b6104bac62fa9225c67
                    MATRIX: 302->1|413->49|681->287|714->304|749->306|787->314|822->327|859->333
                    LINES: 12->1|15->1|28->14|28->14|28->14|29->15|29->15|30->16
                    -- GENERATED --
                */
            