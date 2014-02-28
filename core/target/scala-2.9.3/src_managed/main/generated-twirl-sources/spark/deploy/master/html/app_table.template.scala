
package spark.deploy.master.html

import twirl.api._
import TemplateMagic._


/**/
object app_table extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template1[Array[spark.deploy.master.ApplicationInfo],twirl.api.Html] {

    /**/
    def apply/*1.2*/(apps: Array[spark.deploy.master.ApplicationInfo]):twirl.api.Html = {
        _display_ {

Seq(format.raw/*1.52*/("""

<table class="table table-bordered table-striped table-condensed sortable">
  <thead>
    <tr>
      <th>ID</th>
      <th>Description</th>
      <th>Cores</th>
      <th>Memory per Node</th>
      <th>Submit Time</th>
      <th>User</th>
      <th>State</th>
      <th>Duration</th>
    </tr>
  </thead>
  <tbody>
    """),_display_(Seq(/*17.6*/for(j <- apps) yield /*17.20*/ {_display_(Seq(format.raw/*17.22*/("""
      """),_display_(Seq(/*18.8*/app_row(j))),format.raw/*18.18*/("""
    """)))})),format.raw/*19.6*/("""
  </tbody>
</table>
"""))}
    }

    def render(apps:Array[spark.deploy.master.ApplicationInfo]) = apply(apps)

    def f:((Array[spark.deploy.master.ApplicationInfo]) => twirl.api.Html) = (apps) => apply(apps)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/deploy/master/app_table.scala.html
                    HASH: 277fb1b2649afaf418ca696f3519d63f7e278965
                    MATRIX: 304->1|417->51|769->373|799->387|834->389|872->397|904->407|941->413
                    LINES: 12->1|15->1|31->17|31->17|31->17|32->18|32->18|33->19
                    -- GENERATED --
                */
            