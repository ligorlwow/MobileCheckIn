package controllers;

import models.Group;
import play.mvc.Controller;
import play.mvc.Result;
import play.data.Form;

/**
 * Created by Igor Sychev on 05.11.14.
 */
public class GroupController extends Controller {

    public static Result editGroup(long id) {
        Form<Group> groupForm = Form.form(Group.class);
        return ok(views.html.group.render(groupForm));
    }

    public static Result submit() {
        Form<Group> groupForm = Form.form(Group.class);
        Group group = groupForm.bindFromRequest().get();
        return ok(views.html.group.render(groupForm));
    }
}
