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
import views.html.account.*;
import views.html.admin.*;
import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;

import java.io.File;
// File Upload and image editing
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;
// Import models
import models.*;
import models.shopping.*;


public class HomeController extends Controller {

    private FormFactory formFactory;
    private Environment env;

    @Inject
    public HomeController(FormFactory f, Environment e) {
        this.formFactory = f;
        this.env = e;
    }

    public Result index() {
        return ok(index.render(getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEvent() {

        Form<Event> addEventForm = formFactory.form(Event.class);
        return ok(addEvent.render(addEventForm, getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEventSubmit() {

        Form<Event> newEventForm = formFactory.form(Event.class).bindFromRequest();

        if (newEventForm.hasErrors()) {

            return badRequest(addEvent.render(newEventForm, getUserFromSession()));
        }

        Event newEvent = newEventForm.get();


        if (newEvent.getId() == null) {
            newEvent.save();
            flash("success", "Event " + newEvent.getEventName() + " has been created. Do not forget to add Tickets");
        } else if (newEvent.getId() != null) {
            newEvent.update();
            flash("success", "Event " + newEvent.getEventName() + " has been updated.");
        }

        // Save Image
        MultipartFormData data = request().body().asMultipartFormData();
        // Get image data
        FilePart image = data.getFile("upload");

        // Save the image file
        String saveImageMsg = saveFile(newEvent.getId(), image);
        newEvent.update();


        return redirect(controllers.routes.HomeController.adminevents(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteEvent(Long id) {

        Event e = Event.find.ref(id);

        flash("success", "Event: " + e.getEventName() + " has been deleted");

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

    @Security.Authenticated(Secured.class)
    public Result cart() {
        return ok(cart.render(getUserFromSession(),env));
    }

    public Result contact() {
        Form<Contact> contactForm = formFactory.form(Contact.class);
        return ok(contact.render(contactForm, getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    public Result reportProblem() {
        Form<Contact> contactForm = formFactory.form(Contact.class);
        flash("success", "Please fill out this form to alert admins of any problems.");
        return ok(contact.render(contactForm, getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    public Result myOrders() {
        User u = getUserFromSession();

        List<ShopOrder> orders = u.getOrders();

        return ok(myOrders.render(orders, getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result viewContact() {
        List<Contact> contactList = Contact.findAll();
        return ok(viewContact.render(contactList, getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result viewAccounts() {
        List<User> accountsList = User.findAll();
        return ok(viewAccount.render(accountsList, getUserFromSession()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result viewOrders() {
        List<ShopOrder> orderList = ShopOrder.findAll();
        return ok(viewOrders.render(orderList, getUserFromSession()));
    }

    public Result events(Long cat) {

        // Get list of events
        List<Event> eventsList = new ArrayList<Event>();
        // Render the list events view, passing
        List<Category> categoriesList = Category.findAll();

        if (cat == 0) {
            eventsList = Event.findAll();
        } else {
            eventsList = Category.find.ref(cat).getEvents();
        }

        return ok(events.render(eventsList, categoriesList, getUserFromSession(), env));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result adminevents(Long cat) {

        // Get list of events
        List<Event> eventsList = new ArrayList<Event>();
        // Render the list events view, passing
        List<Category> categoriesList = Category.findAll();

        if (cat == 0) {
            eventsList = Event.findAll();
        } else {
            eventsList = Category.find.ref(cat).getEvents();
        }

        return ok(adminevents.render(eventsList, categoriesList, getUserFromSession(), env));
    }

    public Result eventTicket(Long event) {
        List<Ticket> ticketList = Event.find.ref(event).getTickets();
        Event e = Event.find.ref(event);

        return ok(eventTicket.render(ticketList, e, getUserFromSession(), env));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result admineventTicket(Long event) {
        List<Ticket> ticketList = Event.find.ref(event).getTickets();
        Event e = Event.find.ref(event);

        return ok(admineventTicket.render(ticketList, e, getUserFromSession(), env));
    }

    public Result addContactSubmit() {

        Form<Contact> contactSubmitForm = formFactory.form(Contact.class).bindFromRequest();

        if (contactSubmitForm.hasErrors()) {
            return badRequest(contact.render(null, getUserFromSession()));
        }

        Contact newContact = contactSubmitForm.get();

        newContact.setRead(false);
        newContact.save();

        flash("success", "Message has been sent");

        return redirect(controllers.routes.HomeController.contact());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result markAsRead(Long id , Boolean status){

        Contact c = Contact.find.ref(id);
        c.setRead(status);

        c.save();

        return redirect(routes.HomeController.viewContact());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result markAsProccessed(Long id , Boolean status){

        ShopOrder o = ShopOrder.find.ref(id);
        o.setProccessed(status);

        o.save();

        return redirect(routes.HomeController.viewOrders());
    }

    public Result signUp() {
        Form<User> addUserForm = formFactory.form(User.class);
        return ok(signUp.render(addUserForm, getUserFromSession()));
    }

    public Result signUpSubmit() {
        Form<User> newUser = formFactory.form(User.class).bindFromRequest();
        User user = newUser.get();

        int count = User.find.where().like("email", user.getEmail()).findRowCount();
        if (count>0) {
            flash("danger", "This email address already in use");
            return redirect(routes.HomeController.signUp());
        }else {
            flash("success", "Account Created");
            user.setRole("user");
            user.save();
        }
        return redirect(routes.LoginController.login());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addTicket() {

        Form<Ticket> addTicketForm = formFactory.form(Ticket.class);

        return ok(addTicket.render(addTicketForm, getUserFromSession()));

    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addTicketSubmit() {

        Form<Ticket> newTicketForm = formFactory.form(Ticket.class).bindFromRequest();

        if (newTicketForm.hasErrors()) {
            return badRequest(addTicket.render(newTicketForm, getUserFromSession()));
        }

        Ticket newTicket = newTicketForm.get();
        Long e = newTicket.getEvent().getId();


        if (newTicket.getTicketID() == null) {
            newTicket.save();
            flash("success", newTicket.getTicketType() + " ticket has been created");
        } else if (newTicket.getTicketID() != null) {
            newTicket.update();
            flash("success", newTicket.getTicketType() + " ticket has been updated");
        }



        return redirect(controllers.routes.HomeController.admineventTicket(e));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteTicket(Long id) {

        Ticket t = Ticket.find.ref(id);
        Long e = t.getEvent().getId();
        t.delete();


        flash("success", "Ticket has been deleted");

        return redirect(routes.HomeController.admineventTicket(e));
    }


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateTicket(Long id) {
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

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result updateDetails() {
        User u;
        Form<User> accountForm;

        try {
            u = getUserFromSession();
            accountForm = formFactory.form(User.class).fill(u);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(updateDetails.render(accountForm, getUserFromSession()));
    }

    public Result updateDetailsSubmit() {
        Form<User> userForm = formFactory.form(User.class).bindFromRequest();

        if (userForm.hasErrors()) {

            return badRequest(updateDetails.render(userForm, getUserFromSession()));
        }

        User u = userForm.get();

        u.update();

        MultipartFormData data1 = request().body().asMultipartFormData();
        FilePart image1 = data1.getFile("upload1");

        String saveImageMsg1 = saveFile1(u.getEmail(), image1);

        flash("success", "Details have been updated.");
        return ok(myaccount.render(getUserFromSession(), env));
    }


    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }

    @Security.Authenticated(Secured.class)
    public Result myAccount() {
        return ok(myaccount.render(getUserFromSession(), env));
    }

    // Save an image file
    public String saveFile(Long id, FilePart<File> image) {
        if (image != null) {
            // Get mimetype from image
            String mimeType = image.getContentType();
            // Check if uploaded file is an image
            if (mimeType.startsWith("image/")) {
                // Create file from uploaded image
                File file = image.getFile();
                // create ImageMagick command instance
                ConvertCmd cmd = new ConvertCmd();
                // create the operation, add images and operators/options
                IMOperation op = new IMOperation();
                // Get the uploaded image file
                op.addImage(file.getAbsolutePath());
                // Resize using height and width constraints
                op.resize(450, 200);
                // Save the  image
                op.addImage("public/images/eventImages/" + id + ".jpg");
                // thumbnail
                IMOperation thumb = new IMOperation();
                // Get the uploaded image file
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(60);
                // Save the  image
                thumb.addImage("public/images/eventImages/thumbnails" + id + ".jpg");
                // execute the operation
                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "image file missing";
    }

    public String saveFile1(String id, FilePart<File> image) {
        if (image != null) {
            // Get mimetype from image
            String mimeType = image.getContentType();
            // Check if uploaded file is an image
            if (mimeType.startsWith("image/")) {
                // Create file from uploaded image
                File file = image.getFile();
                // create ImageMagick command instance
                ConvertCmd cmd = new ConvertCmd();
                // create the operation, add images and operators/options
                IMOperation op = new IMOperation();
                // Get the uploaded image file
                op.addImage(file.getAbsolutePath());
                // Resize using height and width constraints
                op.resize(450, 200);
                // Save the  image
                op.addImage("public/images/profile/" + id + ".jpg");
                // thumbnail
                IMOperation thumb = new IMOperation();
                // Get the uploaded image file
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(60);
                // Save the  image
                thumb.addImage("public/images/profile/thumbnails" + id + ".jpg");
                // execute the operation
                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "image file missing";
    }


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteUser(String id) {

        User.find.ref(id).delete();

        flash("danger", "Account has been deleted");
        flash("danger", "Account has been deleted");

        List<User> accountsList = User.findAll();

        return redirect(routes.HomeController.viewAccounts());
    }

}
