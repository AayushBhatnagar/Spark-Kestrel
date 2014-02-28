
package spark.deploy.master.html

import twirl.api._
import TemplateMagic._


/**/
object worker_row extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template1[spark.deploy.master.WorkerInfo,twirl.api.Html] {

    /**/
    def apply/*1.2*/(worker: spark.deploy.master.WorkerInfo):twirl.api.Html = {
        _display_ {import spark.Utils


Seq(format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
<tr>
  <td>
    <a href=""""),_display_(Seq(/*7.15*/worker/*7.21*/.webUiAddress)),format.raw/*7.34*/("""">"""),_display_(Seq(/*7.37*/worker/*7.43*/.id)),format.raw/*7.46*/("""</href>
  </td>
  <td>"""),_display_(Seq(/*9.8*/{worker.host})),format.raw/*9.21*/(""":"""),_display_(Seq(/*9.23*/{worker.port})),format.raw/*9.36*/("""</td>
  <td>"""),_display_(Seq(/*10.8*/worker/*10.14*/.state)),format.raw/*10.20*/("""</td>
  <td>"""),_display_(Seq(/*11.8*/worker/*11.14*/.cores)),format.raw/*11.20*/(""" ("""),_display_(Seq(/*11.23*/worker/*11.29*/.coresUsed)),format.raw/*11.39*/(""" Used)</td>
  <td>"""),_display_(Seq(/*12.8*/{Utils.memoryMegabytesToString(worker.memory)})),format.raw/*12.54*/("""
     ("""),_display_(Seq(/*13.8*/{Utils.memoryMegabytesToString(worker.memoryUsed)})),format.raw/*13.58*/(""" Used)</td>
</tr>
"""))}
    }

    def render(worker:spark.deploy.master.WorkerInfo) = apply(worker)

    def f:((spark.deploy.master.WorkerInfo) => twirl.api.Html) = (worker) => apply(worker)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/deploy/master/worker_row.scala.html
                    HASH: 4a404d1d7e98ef94c0b15d38f7c77e76cd447bc0
                    MATRIX: 293->1|415->41|443->63|500->90|514->96|548->109|581->112|595->118|619->121|671->144|705->157|737->159|771->172|814->185|829->191|857->197|900->210|915->216|943->222|977->225|992->231|1024->241|1073->260|1141->306|1179->314|1251->364
                    LINES: 12->1|16->1|18->4|21->7|21->7|21->7|21->7|21->7|21->7|23->9|23->9|23->9|23->9|24->10|24->10|24->10|25->11|25->11|25->11|25->11|25->11|25->11|26->12|26->12|27->13|27->13
                    -- GENERATED --
                */
            