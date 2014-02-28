
package spark.common.html

import twirl.api._
import TemplateMagic._


/**/
object layout extends BaseScalaTemplate[twirl.api.Html,Format[twirl.api.Html]](twirl.api.HtmlFormat) with twirl.api.Template2[String,Html,twirl.api.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):twirl.api.Html = {
        _display_ {

Seq(format.raw/*1.32*/("""

<!DOCTYPE html>
<html>

  <head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="static/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="static/bootstrap-responsive.min.css" type="text/css">
    <script src="static/sorttable.js"></script>
    <title>"""),_display_(Seq(/*11.13*/title)),format.raw/*11.18*/("""</title>
    <style type="text/css">
      table.sortable thead """),format.raw("""{"""),format.raw/*13.29*/(""" cursor: pointer; """),format.raw("""}"""),format.raw/*13.48*/("""
    </style>
  </head>

  <body>
    <div class="container">
    
      <!-- HEADER -->
      <div class="row">
        <div class="span12">
          <img src="static/spark_logo.png">
          <h1 style="vertical-align: bottom; margin-bottom: 10px; margin-left: 30px; display: inline-block;"> """),_display_(Seq(/*24.112*/title)),format.raw/*24.117*/(""" </h1>
        </div>
      </div>
    
      <hr/>
      
      """),_display_(Seq(/*30.8*/content)),format.raw/*30.15*/("""
    
    </div>
  </body>

</html>"""))}
    }

    def render(title:String,content:Html) = apply(title)(content)

    def f:((String) => (Html) => twirl.api.Html) = (title) => (content) => apply(title)(content)

    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Feb 28 16:46:49 IST 2014
                    SOURCE: /home/prabeesh/spark-0.7.3/core/src/main/twirl/spark/common/layout.scala.html
                    HASH: 85356fba5878564ab882986e45ace8510f7bf695
                    MATRIX: 263->1|356->31|717->361|744->366|856->431|922->450|1251->747|1279->752|1375->818|1404->825
                    LINES: 12->1|15->1|25->11|25->11|27->13|27->13|38->24|38->24|44->30|44->30
                    -- GENERATED --
                */
            