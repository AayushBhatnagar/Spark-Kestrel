
package spark.deploy.worker.html

import twirl.api._
import TemplateMagic._


/**/
object executor_row extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template1[spark.deploy.worker.ExecutorRunner,twirl.api.Html] {

    /**/
    def apply/*1.2*/(executor: spark.deploy.worker.ExecutorRunner):twirl.api.Html = {
        _display_ {import spark.Utils


Seq(format.raw/*1.48*/("""

"""),format.raw/*4.1*/("""
<tr>
  <td>"""),_display_(Seq(/*6.8*/executor/*6.16*/.execId)),format.raw/*6.23*/("""</td>
  <td>"""),_display_(Seq(/*7.8*/executor/*7.16*/.cores)),format.raw/*7.22*/("""</td>
  <td>"""),_display_(Seq(/*8.8*/Utils/*8.13*/.memoryMegabytesToString(executor.memory))),format.raw/*8.54*/("""</td>
  <td>
    <ul class="unstyled">
      <li><strong>ID:</strong> """),_display_(Seq(/*11.33*/executor/*11.41*/.appId)),format.raw/*11.47*/("""</li>
      <li><strong>Name:</strong> """),_display_(Seq(/*12.35*/executor/*12.43*/.appDesc.name)),format.raw/*12.56*/("""</li>
      <li><strong>User:</strong> """),_display_(Seq(/*13.35*/executor/*13.43*/.appDesc.user)),format.raw/*13.56*/("""</li>
    </ul>
  </td>
  <td>
    <a href="log?appId="""),_display_(Seq(/*17.25*/(executor.appId))),format.raw/*17.41*/("""&executorId="""),_display_(Seq(/*17.54*/(executor.execId))),format.raw/*17.71*/("""&logType=stdout">stdout</a>
    <a href="log?appId="""),_display_(Seq(/*18.25*/(executor.appId))),format.raw/*18.41*/("""&executorId="""),_display_(Seq(/*18.54*/(executor.execId))),format.raw/*18.71*/("""&logType=stderr">stderr</a>
  </td>
</tr>
"""))}
    }

    def render(executor:spark.deploy.worker.ExecutorRunner) = apply(executor)

    def f:((spark.deploy.worker.ExecutorRunner) => twirl.api.Html) = (executor) => apply(executor)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/deploy/worker/executor_row.scala.html
                    HASH: 01542ec4e0e7630be10474b928ed6d3e238137d2
                    MATRIX: 299->1|427->47|455->69|497->82|513->90|541->97|583->110|599->118|626->124|668->137|681->142|743->183|845->254|862->262|890->268|961->308|978->316|1013->329|1084->369|1101->377|1136->390|1222->445|1260->461|1304->474|1343->491|1426->543|1464->559|1508->572|1547->589
                    LINES: 12->1|16->1|18->4|20->6|20->6|20->6|21->7|21->7|21->7|22->8|22->8|22->8|25->11|25->11|25->11|26->12|26->12|26->12|27->13|27->13|27->13|31->17|31->17|31->17|31->17|32->18|32->18|32->18|32->18
                    -- GENERATED --
                */
            