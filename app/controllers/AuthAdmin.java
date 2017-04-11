package controllers;

import play.mvc.*;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.*;

// Check if this is an Admin before permitting an action
public class AuthAdmin extends Action.Simple {

    public CompletionStage<Result> call(Http.Context ctx) {
        // Check if user in session is an admin
        String id = ctx.session().get("email");
        if (id != null) {
            User u = User.getUserById(id);

            if ("admin".equals(u.getRole())) {
                // User admin so continue with the http request
                return delegate.call(ctx);
            }
        }
        ctx.flash().put("error", "Admin Login Required");
        return CompletableFuture.completedFuture(redirect(routes.LoginController.login()));
    }
}
