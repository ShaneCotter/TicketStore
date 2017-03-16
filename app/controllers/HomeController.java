package controllers;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.*;
import javax.inject.Inject;
import views.html.*;
// Import models
import models.*;


public class HomeController extends Controller {


    public Result index() {
        return ok(index.render());
    }

    public Result aboutUs() {
        return ok(aboutUs.render());
    }

    public Result addEvent() {
        return ok(addEvent.render());
    }

    public Result cart() {
        return ok(cart.render());
    }

    public Result checkout() {
        return ok(checkout.render());
    }

    public Result contact() {
        return ok(contact.render());
    }

    public Result events() {

        // Get list of events
        List<Event> eventsList = Event.findAll();
        // Render the list events view, passing parameters
        return ok(events.render(eventsList));
    }

    public Result eventTicket() {
        return ok(eventTicket.render());
    }

    public Result login() {
        return ok(login.render());
    }

    public Result signUp() {
        return ok(signUp.render());
    }


}
