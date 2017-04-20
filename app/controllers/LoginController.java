package controllers;


import controllers.*;
import controllers.routes;
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
// Import models
import models.*;
import models.shopping.*;

public class LoginController extends Controller {


    private FormFactory formFactory;

    private Environment env;

    @Inject
    public LoginController(Environment e, FormFactory f) {
        this.formFactory = f;
        this.env = e;
    }


    public Result login() {
        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm, getUserFromSession()));
    }

    public Result loginSubmit() {
        Form<Login> loginSubmitform = formFactory.form(Login.class).bindFromRequest();
        if (loginSubmitform.hasErrors()) {
            flash("danger", "Invalid email or password");
            return badRequest(login.render(null, getUserFromSession()));
        } else {
            flash("success", "You have successfully logged in");
            session().clear();
            session("email", loginSubmitform.get().getEmail());
        }

        User u = getUserFromSession();
        if(u.getBasket() == null) {
            //To prevent null pointer error from user having null basket
            //happened if viewing basket before adding items
            Basket b = new Basket();
            u.setBasket(b);
            u.update();
        }

        return redirect(controllers.routes.HomeController.events(0));
    }

    public Result logout() {
        session().clear();
        flash("success", "Successfully logged out");
        return redirect(routes.LoginController.login());
    }

    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result deleteMyAccount() {

        User u = getUserFromSession();
        logout();
        u.delete();

        flash("danger", "Your account has has been deleted");

        return redirect(routes.LoginController.login());
    }

    @Security.Authenticated(Secured.class)
    public Result cancelDeleteAccount(){

            flash("success", "Account deletion cancelled");
            return redirect(routes.HomeController.myAccount());
    }

    @Security.Authenticated(Secured.class)
    public Result deleteAccountPage(){
        return ok(deleteAccount.render(getUserFromSession()));
    }

}

