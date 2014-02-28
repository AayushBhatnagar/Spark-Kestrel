
package spark.deploy.master.html

import twirl.api._
import TemplateMagic._


/**/
object executors_table extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template1[List[spark.deploy.master.ExecutorInfo],twirl.api.Html] {

    /**/
    def apply/*1.2*/(executors: List[spark.deploy.master.ExecutorInfo]):twirl.api.Html = {
        _display_ {

Seq(format.raw/*1.53*/("""

<table class="table table-bordered table-striped table-condensed">
  <thead>
    <tr>
      <th>ExecutorID</th>
      <th>Worker</th>
      <th>Cores</th>
      <th>Memory</th>
      <th>State</th>
      <th>Logs</th>
    </tr>
  </thead>
  <tbody>
    """),_display_(Seq(/*15.6*/for(e <- executors) yield /*15.25*/ {_display_(Seq(format.raw/*15.27*/("""
      """),_display_(Seq(/*16.8*/executor_row(e))),format.raw/*16.23*/("""
    """)))})),format.raw/*17.6*/("""
  </tbody>
</table>"""))}
    }

    def render(executors:List[spark.deploy.master.ExecutorInfo]) = apply(executors)

    def f:((List[spark.deploy.master.ExecutorInfo]) => twirl.api.Html) = (executors) => apply(executors)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/deploy/master/executors_table.scala.html
                    HASH: ec3edad149b97587e00e124cd015265ff6d3f948
                    MATRIX: 306->1|420->52|706->308|741->327|776->329|814->337|851->352|888->358
                    LINES: 12->1|15->1|29->15|29->15|29->15|30->16|30->16|31->17
                    -- GENERATED --
                */
            