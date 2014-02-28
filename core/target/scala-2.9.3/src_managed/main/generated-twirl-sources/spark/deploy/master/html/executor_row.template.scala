
package spark.deploy.master.html

import twirl.api._
import TemplateMagic._


/**/
object executor_row extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template1[spark.deploy.master.ExecutorInfo,twirl.api.Html] {

    /**/
    def apply/*1.2*/(executor: spark.deploy.master.ExecutorInfo):twirl.api.Html = {
        _display_ {

Seq(format.raw/*1.46*/("""

<tr>
  <td>"""),_display_(Seq(/*4.8*/executor/*4.16*/.id)),format.raw/*4.19*/("""</td>
  <td>
    <a href=""""),_display_(Seq(/*6.15*/executor/*6.23*/.worker.webUiAddress)),format.raw/*6.43*/("""">"""),_display_(Seq(/*6.46*/executor/*6.54*/.worker.id)),format.raw/*6.64*/("""</href>
  </td>
  <td>"""),_display_(Seq(/*8.8*/executor/*8.16*/.cores)),format.raw/*8.22*/("""</td>
  <td>"""),_display_(Seq(/*9.8*/executor/*9.16*/.memory)),format.raw/*9.23*/("""</td>
  <td>"""),_display_(Seq(/*10.8*/executor/*10.16*/.state)),format.raw/*10.22*/("""</td>
  <td>
    <a href=""""),_display_(Seq(/*12.15*/(executor.worker.webUiAddress))),format.raw/*12.45*/("""/log?appId="""),_display_(Seq(/*12.57*/(executor.application.id))),format.raw/*12.82*/("""&executorId="""),_display_(Seq(/*12.95*/(executor.id))),format.raw/*12.108*/("""&logType=stdout">stdout</a>
    <a href=""""),_display_(Seq(/*13.15*/(executor.worker.webUiAddress))),format.raw/*13.45*/("""/log?appId="""),_display_(Seq(/*13.57*/(executor.application.id))),format.raw/*13.82*/("""&executorId="""),_display_(Seq(/*13.95*/(executor.id))),format.raw/*13.108*/("""&logType=stderr">stderr</a>
  </td>
</tr>
"""))}
    }

    def render(executor:spark.deploy.master.ExecutorInfo) = apply(executor)

    def f:((spark.deploy.master.ExecutorInfo) => twirl.api.Html) = (executor) => apply(executor)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/deploy/master/executor_row.scala.html
                    HASH: b9fbef674f59cea3c26add09d16c0cc4f51961b6
                    MATRIX: 297->1|404->45|447->59|463->67|487->70|544->97|560->105|601->125|634->128|650->136|681->146|733->169|749->177|776->183|818->196|834->204|862->211|905->224|922->232|950->238|1008->265|1060->295|1103->307|1150->332|1194->345|1230->358|1303->400|1355->430|1398->442|1445->467|1489->480|1525->493
                    LINES: 12->1|15->1|18->4|18->4|18->4|20->6|20->6|20->6|20->6|20->6|20->6|22->8|22->8|22->8|23->9|23->9|23->9|24->10|24->10|24->10|26->12|26->12|26->12|26->12|26->12|26->12|27->13|27->13|27->13|27->13|27->13|27->13
                    -- GENERATED --
                */
            