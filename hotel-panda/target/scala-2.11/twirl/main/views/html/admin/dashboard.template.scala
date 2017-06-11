
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashboard_Scope0 {
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

class dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/admin/*3.7*/.main("Admin - Dashboard")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
  """),format.raw/*4.3*/("""<div class="content">
    <div class="container-fluid">
      <div class="row">
        <div class="col-md-4">
          <div class="card">
            <div class="header">
              <h4 class="title">Email Statistics</h4>
              <p class="category">Last Campaign Performance</p>
            </div>
            <div class="content">
              <div id="chartPreferences" class="ct-chart ct-perfect-fourth"></div>

              <div class="footer">
                <div class="legend">
                  <i class="fa fa-circle text-info"></i> Open
                  <i class="fa fa-circle text-danger"></i> Bounce
                  <i class="fa fa-circle text-warning"></i> Unsubscribe
                </div>
                <hr>
                <div class="stats">
                  <i class="fa fa-clock-o"></i> Campaign sent 2 days ago
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="col-md-8">
          <div class="card">
            <div class="header">
              <h4 class="title">Users Behavior</h4>
              <p class="category">24 Hours performance</p>
            </div>
            <div class="content">
              <div id="chartHours" class="ct-chart"></div>
              <div class="footer">
                <div class="legend">
                  <i class="fa fa-circle text-info"></i> Open
                  <i class="fa fa-circle text-danger"></i> Click
                  <i class="fa fa-circle text-warning"></i> Click Second Time
                </div>
                <hr>
                <div class="stats">
                  <i class="fa fa-history"></i> Updated 3 minutes ago
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="row">
        <div class="col-md-6">
          <div class="card ">
            <div class="header">
              <h4 class="title">2014 Sales</h4>
              <p class="category">All products including Taxes</p>
            </div>
            <div class="content">
              <div id="chartActivity" class="ct-chart"></div>

              <div class="footer">
                <div class="legend">
                  <i class="fa fa-circle text-info"></i> Tesla Model S
                  <i class="fa fa-circle text-danger"></i> BMW 5 Series
                </div>
                <hr>
                <div class="stats">
                  <i class="fa fa-check"></i> Data information certified
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="col-md-6">
          <div class="card ">
            <div class="header">
              <h4 class="title">Tasks</h4>
              <p class="category">Backend development</p>
            </div>
            <div class="content">
              <div class="table-full-width">
                <table class="table">
                  <tbody>
                    <tr>
                      <td>
                        <label class="checkbox">
                          <input type="checkbox" value="" data-toggle="checkbox">
                        </label>
                      </td>
                      <td>Sign contract for "What are conference organizers afraid of?"</td>
                      <td class="td-actions text-right">
                        <button type="button" rel="tooltip" title="Edit Task" class="btn btn-info btn-simple btn-xs">
                          <i class="fa fa-edit"></i>
                        </button>
                        <button type="button" rel="tooltip" title="Remove" class="btn btn-danger btn-simple btn-xs">
                          <i class="fa fa-times"></i>
                        </button>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <label class="checkbox">
                          <input type="checkbox" value="" data-toggle="checkbox" checked="">
                        </label>
                      </td>
                      <td>Lines From Great Russian Literature? Or E-mails From My Boss?</td>
                      <td class="td-actions text-right">
                        <button type="button" rel="tooltip" title="Edit Task" class="btn btn-info btn-simple btn-xs">
                          <i class="fa fa-edit"></i>
                        </button>
                        <button type="button" rel="tooltip" title="Remove" class="btn btn-danger btn-simple btn-xs">
                          <i class="fa fa-times"></i>
                        </button>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <label class="checkbox">
                          <input type="checkbox" value="" data-toggle="checkbox" checked="">
                        </label>
                      </td>
                      <td>Flooded: One year later, assessing what was lost and what was found when a ravaging rain swept through metro Detroit</td>
                      <td class="td-actions text-right">
                        <button type="button" rel="tooltip" title="Edit Task" class="btn btn-info btn-simple btn-xs">
                          <i class="fa fa-edit"></i>
                        </button>
                        <button type="button" rel="tooltip" title="Remove" class="btn btn-danger btn-simple btn-xs">
                          <i class="fa fa-times"></i>
                        </button>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <label class="checkbox">
                          <input type="checkbox" value="" data-toggle="checkbox">
                        </label>
                      </td>
                      <td>Create 4 Invisible User Experiences you Never Knew About</td>
                      <td class="td-actions text-right">
                        <button type="button" rel="tooltip" title="Edit Task" class="btn btn-info btn-simple btn-xs">
                          <i class="fa fa-edit"></i>
                        </button>
                        <button type="button" rel="tooltip" title="Remove" class="btn btn-danger btn-simple btn-xs">
                          <i class="fa fa-times"></i>
                        </button>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <label class="checkbox">
                          <input type="checkbox" value="" data-toggle="checkbox">
                        </label>
                      </td>
                      <td>Read "Following makes Medium better"</td>
                      <td class="td-actions text-right">
                        <button type="button" rel="tooltip" title="Edit Task" class="btn btn-info btn-simple btn-xs">
                          <i class="fa fa-edit"></i>
                        </button>
                        <button type="button" rel="tooltip" title="Remove" class="btn btn-danger btn-simple btn-xs">
                          <i class="fa fa-times"></i>
                        </button>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <label class="checkbox">
                          <input type="checkbox" value="" data-toggle="checkbox">
                        </label>
                      </td>
                      <td>Unfollow 5 enemies from twitter</td>
                      <td class="td-actions text-right">
                        <button type="button" rel="tooltip" title="Edit Task" class="btn btn-info btn-simple btn-xs">
                          <i class="fa fa-edit"></i>
                        </button>
                        <button type="button" rel="tooltip" title="Remove" class="btn btn-danger btn-simple btn-xs">
                          <i class="fa fa-times"></i>
                        </button>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>

              <div class="footer">
                <hr>
                <div class="stats">
                  <i class="fa fa-history"></i> Updated 3 minutes ago
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
""")))}),format.raw/*201.2*/("""
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
object dashboard extends dashboard_Scope0.dashboard
              /*
                  -- GENERATED --
                  DATE: Sun Jun 11 16:38:13 ICT 2017
                  SOURCE: D:/Research/Java/hotel-panda/app/views/admin/dashboard.scala.html
                  HASH: 0a4766598020f8fa1c66870793a056d5314f3120
                  MATRIX: 752->1|848->3|878->8|890->13|924->39|963->41|993->45|9722->8743
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|232->201
                  -- GENERATED --
              */
          