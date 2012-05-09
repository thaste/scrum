package controllers;


import models.Sprint;
import play.data.Form;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Stefaan, have a nice day"));
  }
  

    public static Result addSprint() {
        Form<Sprint> form = form(Sprint.class).bindFromRequest();
        Sprint sprint = form.get();
        sprint.save();
        return redirect(routes.Application.index());
    }
}