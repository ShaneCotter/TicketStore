package controllers;

import controllers.*;
import models.users.User;
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

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f){
        this.formFactory = f;
    }

    public Result index() {
        return ok(index.render(getUserFromSession()));
    }

    public Result aboutUs() {
        return ok(aboutUs.render(getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEvent() {

        Form<Event> addEventForm = formFactory.form(Event.class);
        return ok(addEvent.render(addEventForm,getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEventSubmit(){

        Form<Event> newEventForm = formFactory.form(Event.class).bindFromRequest();

        if(newEventForm.hasErrors()){

            return badRequest(addEvent.render(newEventForm,getUserFromSession()));
        }

        Event newEvent = newEventForm.get();

        if (newEvent.getEventID() ==  null) {
            newEvent.save();
        }

        else if (newEvent.getEventID() != null) {
            newEvent.update();
        }

        flash("success", "Event " + newEvent.getEventName() + " has been created. Do not forget to add Tickets");

        return redirect(controllers.routes.HomeController.events(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteEvent(Long id){

        Event.find.ref(id).delete();

        flash("success","Event has been deleted");

        return redirect(routes.HomeController.events(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateEvent(Long id) {
        Event e;
        Form<Event> eventForm;

        try {
            e = Event.find.byId(id);
            eventForm = formFactory.form(Event.class).fill(e);
        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addEvent.render(eventForm, getUserFromSession()));
    }

    public Result cart() {
        return ok(cart.render(getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result checkout() {
        return ok(checkout.render(getUserFromSession()));
    }

    public Result contact() {
        return ok(contact.render(getUserFromSession()));
    }

    public Result events(Long cat) {

        // Get list of events
        List<Event> eventsList = new ArrayList<Event>();
        // Render the list events view, passing
        List<Category> categoriesList = Category.findAll();

        if(cat == 0){
            eventsList = Event.findAll();
        }
        else{
            eventsList = Category.find.ref(cat).getEvents();
        }

        return ok(events.render(eventsList,categoriesList,getUserFromSession()));
    }

    public Result eventTicket(Long event) {
        List<Ticket> ticketList = Event.find.ref(event).getTickets();

        return ok(eventTicket.render(ticketList,getUserFromSession()));
    }

    public Result signUp() {
        Form<User> addUserForm = formFactory.form(User.class);
        return ok(signUp.render(addUserForm,getUserFromSession()));
    }

    public Result signUpSubmit(){
        Form<User> newUser = formFactory.form(User.class).bindFromRequest();
        User user = newUser.get();
        user.setRole("user");
        user.save();
        return redirect(routes.LoginController.login());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addTicket() {

        Form<Ticket> addTicketForm = formFactory.form(Ticket.class);

        return ok(addTicket.render(addTicketForm,getUserFromSession()));

    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addTicketSubmit(){

        Form<Ticket> newTicketForm = formFactory.form(Ticket.class).bindFromRequest();

        if(newTicketForm.hasErrors()){
            return badRequest(addTicket.render(newTicketForm,getUserFromSession()));
        }

        Ticket newTicket = newTicketForm.get();

        newTicket.save();

        flash("success", "Ticket " + newTicket.getTicketType() + "has been created");

        return redirect(controllers.routes.HomeController.index());
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result deleteTicket(Long id){

        Ticket.find.ref(id).delete();

        flash("success","Ticket has been deleted");

        return redirect(routes.HomeController.eventTicket(id));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result updateTicket(Long id){
        Ticket t;
        Form<Ticket> ticketForm;

        try {
            t = Ticket.find.byId(id);
            ticketForm = formFactory.form(Ticket.class).fill(t);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addTicket.render(ticketForm, getUserFromSession()));
    }

    private User getUserFromSession(){
        return User.getUserById(session().get("email"));
    }

}
