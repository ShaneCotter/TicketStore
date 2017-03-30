package controllers;

import controllers.*;
import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import models.*;
import models.users.*;

// This class returns a user id (email) if a user is logged in
// If not logged in redirect to login page
public class Secured extends Security.Authenticator {

    //Get the email (username) of th elogged in user
    // null returned if no user logged in - onUnauthorised
    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }

    // If not logged in then open the login page
    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(controllers.routes.LoginController.login());
    }
}
