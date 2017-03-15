package controllers;

import play.mvc.*;

import views.html.*;


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
        return ok(events.render());
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
