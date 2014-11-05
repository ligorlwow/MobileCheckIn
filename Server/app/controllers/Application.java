package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.data.Form;

public class Application extends Controller {
    
    public static Result index() {
        return ok(views.html.index.render("Hello world"));
    }
    
}
