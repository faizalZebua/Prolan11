package controllers;

import play.mvc.*;

public class LoginController extends Controller {
  public Result view() {
    return redirect("/dashboard");
  }
}
