
package views.html.admin

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
    <link href=""""),_display_(/*10.18*/routes/*10.24*/.Assets.versioned("stylesheets/animate.min.css")),format.raw/*10.72*/("""" rel="stylesheet"/>
    <link href=""""),_display_(/*11.18*/routes/*11.24*/.Assets.versioned("stylesheets/light-bootstrap-dashboard.css")),format.raw/*11.86*/("""" rel="stylesheet"/>
    <link href=""""),_display_(/*12.18*/routes/*12.24*/.Assets.versioned("stylesheets/demo.css")),format.raw/*12.65*/("""" rel="stylesheet"/>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*13.50*/routes/*13.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.97*/("""">
    <link rel="stylesheet" href=""""),_display_(/*14.35*/routes/*14.41*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*14.94*/("""">
    <link href=""""),_display_(/*15.18*/routes/*15.24*/.Assets.versioned("stylesheets/pe-icon-7-stroke.css")),format.raw/*15.77*/("""" rel="stylesheet"/>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.55*/routes/*16.61*/.Assets.versioned("images/favicon.png")),format.raw/*16.100*/("""">
  </head>
  <body>
    <div class="wrapper">
      <div class="sidebar" data-color="blue">

      	<div class="sidebar-wrapper">
              <div class="logo">
                  <a href="/" class="simple-text">
                      Creative Tim
                  </a>
              </div>

              <ul class="nav">
                  <li class="active">
                      <a href="dashboard.html">
                          <i class="pe-7s-graph"></i>
                          <p>Dashboard</p>
                      </a>
                  </li>
                  <li>
                      <a href="user.html">
                          <i class="pe-7s-user"></i>
                          <p>User Profile</p>
                      </a>
                  </li>
                  <li>
                      <a href="table.html">
                          <i class="pe-7s-note2"></i>
                          <p>Table List</p>
                      </a>
                  </li>
                  <li>
                      <a href="typography.html">
                          <i class="pe-7s-news-paper"></i>
                          <p>Typography</p>
                      </a>
                  </li>
                  <li>
                      <a href="icons.html">
                          <i class="pe-7s-science"></i>
                          <p>Icons</p>
                      </a>
                  </li>
                  <li>
                      <a href="maps.html">
                          <i class="pe-7s-map-marker"></i>
                          <p>Maps</p>
                      </a>
                  </li>
                  <li>
                      <a href="notifications.html">
                          <i class="pe-7s-bell"></i>
                          <p>Notifications</p>
                      </a>
                  </li>
              </ul>
      	</div>
      </div>

      <div class="main-panel">
        <nav class="navbar navbar-default navbar-fixed">
          <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation-example-2">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Dashboard</a>
            </div>
            <div class="collapse navbar-collapse">
              <ul class="nav navbar-nav navbar-left">
                <li>
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <i class="fa fa-dashboard"></i>
			              <p class="hidden-lg hidden-md">Dashboard</p>
                  </a>
                </li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <i class="fa fa-globe"></i>
                    <b class="caret hidden-sm hidden-xs"></b>
                    <span class="notification hidden-sm hidden-xs">5</span>
      							<p class="hidden-lg hidden-md">
      								5 Notifications
      								<b class="caret"></b>
      							</p>
                  </a>
                  <ul class="dropdown-menu">
                    <li><a href="#">Notification 1</a></li>
                    <li><a href="#">Notification 2</a></li>
                    <li><a href="#">Notification 3</a></li>
                    <li><a href="#">Notification 4</a></li>
                    <li><a href="#">Another notification</a></li>
                  </ul>
                </li>
                <li>
                 <a href="">
                    <i class="fa fa-search"></i>
		                <p class="hidden-lg hidden-md">Search</p>
                  </a>
                </li>
              </ul>

              <ul class="nav navbar-nav navbar-right">
                <li>
                  <a href="">
                    <p>Account</p>
                  </a>
                </li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <p>Dropdown <b class="caret"></b></p>
                  </a>
                  <ul class="dropdown-menu">
                    <li><a href="#">Action</a></li>
                    <li><a href="#">Another action</a></li>
                    <li><a href="#">Something</a></li>
                    <li><a href="#">Another action</a></li>
                    <li><a href="#">Something</a></li>
                    <li class="divider"></li>
                    <li><a href="#">Separated link</a></li>
                  </ul>
                </li>
                <li>
                  <a href="#">
                    <p>Log out</p>
                  </a>
                </li>
		            <li class="separator hidden-lg hidden-md"></li>
              </ul>
            </div>
          </div>
        </nav>

        """),_display_(/*153.10*/content),format.raw/*153.17*/("""

        """),format.raw/*155.9*/("""<footer class="footer">
          <div class="container-fluid">
            <nav class="pull-left">
              <ul>
                <li>
                  <a href="#">
                    Home
                  </a>
                </li>
                <li>
                  <a href="#">
                    Company
                  </a>
                </li>
                <li>
                  <a href="#">
                    Portfolio
                  </a>
                </li>
                <li>
                  <a href="#">
                    Blog
                  </a>
                </li>
              </ul>
            </nav>
          </div>
        </footer>

      </div>
    </div>

    <script src=""""),_display_(/*187.19*/routes/*187.25*/.Assets.versioned("javascripts/jquery-1.10.2.js")),format.raw/*187.74*/("""" type="text/javascript"></script>
  	<script src=""""),_display_(/*188.18*/routes/*188.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*188.73*/("""" type="text/javascript"></script>
  	<script src=""""),_display_(/*189.18*/routes/*189.24*/.Assets.versioned("javascripts/bootstrap-checkbox-radio-switch.js")),format.raw/*189.91*/(""""></script>
    <script src=""""),_display_(/*190.19*/routes/*190.25*/.Assets.versioned("javascripts/chartist.min.js")),format.raw/*190.73*/(""""></script>
    <script src=""""),_display_(/*191.19*/routes/*191.25*/.Assets.versioned("javascripts/bootstrap-notify.js")),format.raw/*191.77*/(""""></script>
    <script src=""""),_display_(/*192.19*/routes/*192.25*/.Assets.versioned("javascripts/main.js")),format.raw/*192.65*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*193.19*/routes/*193.25*/.Assets.versioned("javascripts/light-bootstrap-dashboard.js")),format.raw/*193.86*/(""""></script>
    <script src=""""),_display_(/*194.19*/routes/*194.25*/.Assets.versioned("javascripts/demo.js")),format.raw/*194.65*/(""""></script>
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
                  DATE: Sun Jun 11 16:30:43 ICT 2017
                  SOURCE: D:/Research/Java/hotel-panda/app/views/admin/main.scala.html
                  HASH: bf0eca21bbdc57807ddcee605e4256fb0b78a0aa
                  MATRIX: 754->1|879->31|907->33|1233->333|1258->338|1311->365|1325->371|1395->421|1462->461|1477->467|1546->515|1612->554|1627->560|1710->622|1776->661|1791->667|1853->708|1951->779|1966->785|2028->826|2093->864|2108->870|2182->923|2230->944|2245->950|2319->1003|2422->1079|2437->1085|2498->1124|7775->6373|7804->6380|7844->6392|8637->7157|8653->7163|8724->7212|8805->7265|8821->7271|8892->7320|8973->7373|8989->7379|9078->7446|9137->7477|9153->7483|9223->7531|9282->7562|9298->7568|9372->7620|9431->7651|9447->7657|9509->7697|9591->7751|9607->7757|9690->7818|9749->7849|9765->7855|9827->7895
                  LINES: 27->1|32->1|33->2|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|184->153|184->153|186->155|218->187|218->187|218->187|219->188|219->188|219->188|220->189|220->189|220->189|221->190|221->190|221->190|222->191|222->191|222->191|223->192|223->192|223->192|224->193|224->193|224->193|225->194|225->194|225->194
                  -- GENERATED --
              */
          