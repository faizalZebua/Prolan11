package controllers;

import play.mvc.*;

public class DashboardController extends Controller {
  public Result view() {
    return ok(views.html.admin.dashboard.render());
  }
}
