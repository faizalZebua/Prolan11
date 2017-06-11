
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Homepage")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
  """),format.raw/*4.3*/("""<div class="content">
    <h1>Hello World!!</h1>
  </div>
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Jun 11 16:23:14 ICT 2017
                  SOURCE: D:/Research/Java/hotel-panda/app/views/index.scala.html
                  HASH: 221d3f3fe5a5137a56a9291c7fceddb2557b0956
                  MATRIX: 738->1|834->3|864->8|888->24|927->26|957->30|1048->92
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7
                  -- GENERATED --
              */
          