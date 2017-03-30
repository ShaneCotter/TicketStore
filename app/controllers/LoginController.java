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
// Import models
import models.*;

public class LoginController extends Controller {


    private FormFactory formFactory;

    private Environment env;

    @Inject
    public LoginController(Environment e, FormFactory f){
        this.formFactory = f;
        this.env = e;
    }


    public Result login(){
        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm,getUserFromSession()));
    }

    public Result loginSubmit(){
        Form<Login> loginSubmitform = formFactory.form(Login.class).bindFromRequest();
        if (loginSubmitform.hasErrors()){
            return badRequest(login.render(null,getUserFromSession()));
        }else{
            session().clear();
            session("email",loginSubmitform.get().getEmail());
        }
        return redirect(controllers.routes.HomeController.index());
    }

    public Result logout(){
        session().clear();
        return redirect(routes.HomeController.index());
    }

    private User getUserFromSession(){
        return User.getUserById(session().get("email"));
    }


}
