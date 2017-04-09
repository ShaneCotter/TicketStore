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

        if (newEvent.getId() ==  null) {
            newEvent.save();
            flash("success", "Event " + newEvent.getEventName() + " has been created. Do not forget to add Tickets");
        }

        else if (newEvent.getId() != null) {
            newEvent.update();
            flash("success", "Event " + newEvent.getEventName() + " has been updated.");
        }


        return redirect(controllers.routes.HomeController.adminevents(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteEvent(Long id){

        Event e = Event.find.ref(id);

        flash("success","Event: " + e.getEventName() + " has been deleted");

        Event.find.ref(id).delete();



        return redirect(routes.HomeController.adminevents(0));
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
        Form<Contact> contactForm = formFactory.form(Contact.class);
        return ok(contact.render(contactForm,getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result viewContact(){
        List<Contact> contactList = Contact.findAll();
        return ok(viewContact.render(contactList,getUserFromSession()));
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

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result adminevents(Long cat) {

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

        return ok(adminevents.render(eventsList,categoriesList,getUserFromSession()));
    }

    public Result eventTicket(Long event) {
        List<Ticket> ticketList = Event.find.ref(event).getTickets();
        Event e = Event.find.ref(event);

        return ok(eventTicket.render(ticketList,e,getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result admineventTicket(Long event) {
        List<Ticket> ticketList = Event.find.ref(event).getTickets();
        Event e = Event.find.ref(event);

        return ok(admineventTicket.render(ticketList,e,getUserFromSession()));
    }

    public Result addContactSubmit(){

        Form<Contact> contactSubmitForm = formFactory.form(Contact.class).bindFromRequest();

        if(contactSubmitForm.hasErrors()){
            return badRequest(contact.render(null,getUserFromSession()));
        }

        Contact newContact = contactSubmitForm.get();

        newContact.save();

        flash("success","Message has been sent");

        return redirect(controllers.routes.HomeController.contact());
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

        return redirect(controllers.routes.HomeController.adminevents(0));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result deleteTicket(Long id){

        Ticket.find.ref(id).delete();

        flash("success","Ticket has been deleted");

        return redirect(routes.HomeController.admineventTicket(id));
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
