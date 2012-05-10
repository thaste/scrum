package controllers;



import models.Sprint;

import play.mvc.*;
import play.db.ebean.Model;
import java.util.List;

import play.data.Form;
import static play.libs.Json.toJson;
import views.html.*;

public class Application extends Controller {
  
  public static Result index() {

    return ok(index.render("Stefaan",form(Sprint.class)));
  }
  

    public static Result addSprint() {
        Form<Sprint> form = form(Sprint.class).bindFromRequest();
        Sprint sprint = form.get();
        sprint.save();
        return redirect(routes.Application.index());
    }
    
    public static Result getSprints() {
        List<Sprint> sprints = new Model.Finder(String.class, Sprint.class).all();
        return ok(toJson(sprints));
    }

}


