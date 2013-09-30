package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Hello Jeff."));
    }

    public static Result jeff() {
        return ok(jeff.render());
    }

    public static Result pinelake() {
        return ok(pinelake_index.render());
    }

    public static Result gallery() {
        return ok(gallery.render());
    }

    public static Result blog() {
        return ok(blog.render());
    }

    public static Result contact() {
        return ok(contact.render());
    }

    public static Result events() {
        return ok(events.render());
    }
}
