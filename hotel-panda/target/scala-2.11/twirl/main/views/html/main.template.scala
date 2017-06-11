
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
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
    <title>"""),_display_(/*8.13*/title),format.raw/*8.18*/("""</title>
    <link href=""""),_display_(/*9.18*/routes/*9.24*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*9.74*/("""" rel="stylesheet" />
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("images/favicon.png")),format.raw/*10.100*/("""">
  </head>
  <body>

    """),_display_(/*14.6*/content),format.raw/*14.13*/("""

  	"""),format.raw/*16.4*/("""<script src=""""),_display_(/*16.18*/routes/*16.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*16.73*/("""" type="text/javascript"></script>
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
                  DATE: Sun Jun 11 16:36:56 ICT 2017
                  SOURCE: D:/Research/Java/hotel-panda/app/views/main.scala.html
                  HASH: 7df7e6ad5cc102c16bd89927d587e171ee4829f3
                  MATRIX: 748->1|873->31|901->33|1227->333|1252->338|1305->365|1319->371|1389->421|1493->498|1508->504|1569->543|1627->575|1655->582|1689->589|1730->603|1745->609|1815->658
                  LINES: 27->1|32->1|33->2|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|45->14|45->14|47->16|47->16|47->16|47->16
                  -- GENERATED --
              */
          