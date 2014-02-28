
package spark.deploy.master.html

import twirl.api._
import TemplateMagic._


/**/
object app_row extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template1[spark.deploy.master.ApplicationInfo,twirl.api.Html] {

    /**/
    def apply/*1.2*/(app: spark.deploy.master.ApplicationInfo):twirl.api.Html = {
        _display_ {import spark.Utils

import spark.deploy.WebUI.formatDate

import spark.deploy.WebUI.formatDuration


Seq(format.raw/*1.44*/("""

"""),format.raw/*6.1*/("""
<tr>
  <td>
    <a href="app?appId="""),_display_(Seq(/*9.25*/(app.id))),format.raw/*9.33*/("""">"""),_display_(Seq(/*9.36*/app/*9.39*/.id)),format.raw/*9.42*/("""</a>
  </td>
  <td>"""),_display_(Seq(/*11.8*/app/*11.11*/.desc.name)),format.raw/*11.21*/("""</td>
  <td>
    """),_display_(Seq(/*13.6*/app/*13.9*/.coresGranted)),format.raw/*13.22*/("""
  </td>
  <td>"""),_display_(Seq(/*15.8*/Utils/*15.13*/.memoryMegabytesToString(app.desc.memoryPerSlave))),format.raw/*15.62*/("""</td>
  <td>"""),_display_(Seq(/*16.8*/formatDate(app.submitDate))),format.raw/*16.34*/("""</td>
  <td>"""),_display_(Seq(/*17.8*/app/*17.11*/.desc.user)),format.raw/*17.21*/("""</td>
  <td>"""),_display_(Seq(/*18.8*/app/*18.11*/.state.toString())),format.raw/*18.28*/("""</td>
  <td>"""),_display_(Seq(/*19.8*/formatDuration(app.duration))),format.raw/*19.36*/("""</td>
</tr>
"""))}
    }

    def render(app:spark.deploy.master.ApplicationInfo) = apply(app)

    def f:((spark.deploy.master.ApplicationInfo) => twirl.api.Html) = (app) => apply(app)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/deploy/master/app_row.scala.html
                    HASH: 67909f0938872e20a23d0cfbe691d64040f74de3
                    MATRIX: 295->1|499->43|527->145|594->182|623->190|656->193|667->196|691->199|741->219|753->222|785->232|833->250|844->253|879->266|925->282|939->287|1010->336|1053->349|1101->375|1144->388|1156->391|1188->401|1231->414|1243->417|1282->434|1325->447|1375->475
                    LINES: 12->1|20->1|22->6|25->9|25->9|25->9|25->9|25->9|27->11|27->11|27->11|29->13|29->13|29->13|31->15|31->15|31->15|32->16|32->16|33->17|33->17|33->17|34->18|34->18|34->18|35->19|35->19
                    -- GENERATED --
                */
            