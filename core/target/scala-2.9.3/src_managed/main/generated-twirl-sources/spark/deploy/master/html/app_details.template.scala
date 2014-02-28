
package spark.deploy.master.html

import twirl.api._
import TemplateMagic._


/**/
object app_details extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template1[spark.deploy.master.ApplicationInfo,twirl.api.Html] {

    /**/
    def apply/*1.2*/(app: spark.deploy.master.ApplicationInfo):twirl.api.Html = {
        _display_ {

Seq(format.raw/*1.44*/("""

"""),_display_(Seq(/*3.2*/spark/*3.7*/.common.html.layout(title = "Application Details")/*3.57*/ {_display_(Seq(format.raw/*3.59*/("""
      
  <!-- Application Details -->
  <div class="row">
    <div class="span12">
      <ul class="unstyled">
        <li><strong>ID:</strong> """),_display_(Seq(/*9.35*/app/*9.38*/.id)),format.raw/*9.41*/("""</li>
        <li><strong>Description:</strong> """),_display_(Seq(/*10.44*/app/*10.47*/.desc.name)),format.raw/*10.57*/("""</li>
        <li><strong>User:</strong> """),_display_(Seq(/*11.37*/app/*11.40*/.desc.user)),format.raw/*11.50*/("""</li>
        <li><strong>Cores:</strong> 
          """),_display_(Seq(/*13.12*/app/*13.15*/.desc.cores)),format.raw/*13.26*/(""" 
          ("""),_display_(Seq(/*14.13*/app/*14.16*/.coresGranted)),format.raw/*14.29*/(""" Granted 
          """),_display_(Seq(/*15.12*/if(app.desc.cores == Integer.MAX_VALUE)/*15.51*/ {_display_(Seq(format.raw/*15.53*/("""

          """)))}/*17.13*/else/*17.18*/{_display_(Seq(format.raw/*17.19*/("""
            , """),_display_(Seq(/*18.16*/app/*18.19*/.coresLeft)),format.raw/*18.29*/("""
          """)))})),format.raw/*19.12*/("""
          )
        </li>
        <li><strong>Memory per Slave:</strong> """),_display_(Seq(/*22.49*/app/*22.52*/.desc.memoryPerSlave)),format.raw/*22.72*/("""</li>
        <li><strong>Submit Date:</strong> """),_display_(Seq(/*23.44*/app/*23.47*/.submitDate)),format.raw/*23.58*/("""</li>
        <li><strong>State:</strong> """),_display_(Seq(/*24.38*/app/*24.41*/.state)),format.raw/*24.47*/("""</li>
      </ul>
    </div>
  </div>
  
  <hr/>
  
  <!-- Executors -->
  <div class="row">
    <div class="span12">
      <h3> Executor Summary </h3>
      <br/>
      """),_display_(Seq(/*36.8*/executors_table(app.executors.values.toList))),format.raw/*36.52*/("""
    </div>
  </div>
      
""")))})),format.raw/*40.2*/("""
"""))}
    }

    def render(app:spark.deploy.master.ApplicationInfo) = apply(app)

    def f:((spark.deploy.master.ApplicationInfo) => twirl.api.Html) = (app) => apply(app)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/deploy/master/app_details.scala.html
                    HASH: cc471b642ae2858d52040a0b36e262b2ffed7e77
                    MATRIX: 299->1|404->43|436->46|448->51|506->101|540->103|716->249|727->252|751->255|831->304|843->307|875->317|948->359|960->362|992->372|1077->426|1089->429|1122->440|1167->454|1179->457|1214->470|1266->491|1314->530|1349->532|1381->546|1394->551|1428->552|1475->568|1487->571|1519->581|1563->593|1669->668|1681->671|1723->691|1803->740|1815->743|1848->754|1922->797|1934->800|1962->806|2163->977|2229->1021|2289->1050
                    LINES: 12->1|15->1|17->3|17->3|17->3|17->3|23->9|23->9|23->9|24->10|24->10|24->10|25->11|25->11|25->11|27->13|27->13|27->13|28->14|28->14|28->14|29->15|29->15|29->15|31->17|31->17|31->17|32->18|32->18|32->18|33->19|36->22|36->22|36->22|37->23|37->23|37->23|38->24|38->24|38->24|50->36|50->36|54->40
                    -- GENERATED --
                */
            