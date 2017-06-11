
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*5.17*/title),format.raw/*5.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*6.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.59*/routes/*7.65*/.Assets.versioned("images/favicon.png")),format.raw/*7.104*/("""">
    </head>
    <body>
        """),_display_(/*10.10*/content),format.raw/*10.17*/("""
        """),format.raw/*11.9*/("""<script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("javascripts/main.js")),format.raw/*11.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun Jun 11 09:40:53 ICT 2017
                  SOURCE: D:/Research/Java/hotel-panda/app/views/main.scala.html
                  HASH: 4a78572b7dfa57c43b6cef80caa0a3c2cd9d4b0d
                  MATRIX: 748->1|873->31|901->33|990->96|1015->101|1104->164|1118->170|1180->211|1268->273|1282->279|1342->318|1407->356|1435->363|1472->373|1513->387|1528->393|1589->433
                  LINES: 27->1|32->1|33->2|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|41->10|41->10|42->11|42->11|42->11|42->11
                  -- GENERATED --
              */
          