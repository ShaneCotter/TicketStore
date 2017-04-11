package controllers;


import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;
import views.html.account.*;
import views.html.admin.*;

// Import models
import models.*;
import models.users.*;


public class EventController extends Controller {

    private FormFactory formFactory;

    private Environment env;

    public Result index() {
        return redirect(routes.EventController.listEvents(0, ""));
    }

    @Inject
    public EventController(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }

    public Result listEvents(Long cat, String filter) {
        List<Category> categories = Category.findAll();
        List<Event> events = new ArrayList<Event>();

        if (cat == 0) {
            events = Event.findAllS(filter);
        } else {
            events = Event.findFilter(cat, filter);
        }

        return ok(listEvents.render(events, categories, getUserFromSession(), env, cat, filter));
    }
}
