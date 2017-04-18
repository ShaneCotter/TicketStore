package controllers;

import play.mvc.*;

import views.html.*;
import views.html.account.*;
import views.html.admin.*;
import play.db.ebean.Transactional;
import play.api.Environment;
import javax.inject.Inject;

// Import models
import models.users.*;
import models.*;
import models.shopping.*;



// Authenticate user
@Security.Authenticated(Secured.class)


public class ShoppingCtrl extends Controller {

    private Environment env;

    @Inject
    public ShoppingCtrl(Environment e) {
        this.env = e;
    }

    // Get a user - if logged in email will be set in the session
    private User getCurrentUser() {
        return User.getUserById(session().get("email"));
    }

    @Transactional
    public Result showBasket() {
        return ok(cart.render(getCurrentUser(),env));
    }

    // Add item to customer basket
    @Transactional
    public Result addToBasket(Long id) {

        // Find the product
        Ticket t = Ticket.find.byId(id);

        // Get basket for logged in customer
        User user = User.getUserById(session().get("email"));

        // Check if item in basket
        if (user.getBasket() == null) {
            // If no basket, create one
            user.setBasket(new Basket());
            user.getBasket().setUser(user);
            user.update();
        }
        // Add product to the basket and save
        user.getBasket().addTicket(t);
        user.update();

        // Show the basket contents
        return redirect(routes.ShoppingCtrl.showBasket());
    }

    // Add an item to the basket
    @Transactional
    public Result addOne(Long itemId) {

        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);
        // Increment quantity
        item.increaseQty();
        // Save
        item.update();
        // Show updated basket
        return redirect(routes.ShoppingCtrl.showBasket());
    }

    @Transactional
    public Result removeOne(Long itemId) {

        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);
        // Get user
        User u = getCurrentUser();
        // Call basket remove item method
        u.getBasket().removeItem(item);
        u.getBasket().update();
        // back to basket
        return redirect(routes.ShoppingCtrl.showBasket());
    }

    @Transactional
    public Result removeFromCart(Long itemId) {

        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);

        User u = getCurrentUser();
        u.getBasket().removeFromCart(item);
        u.getBasket().update();

        // Show updated basket
        return redirect(routes.ShoppingCtrl.showBasket());
    }

    // Empty Basket
    @Transactional
    public Result emptyBasket() {

        User u = getCurrentUser();
        u.getBasket().removeAllItems();
        u.getBasket().update();

        return redirect(routes.ShoppingCtrl.showBasket());
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result placeOrder() {
        User u = getCurrentUser();

        // Create an order instance
        ShopOrder order = new ShopOrder();

        // Associate order with customer
        order.setUser(u);

        // Copy basket to order
        order.setItems(u.getBasket().getBasketItems());

        // Save the order now to generate a new id for this order
        order.setProccessed(false);
        order.save();

        // Move items from basket to order
        for (OrderItem i : order.getItems()) {
            // Associate with order
            i.setOrder(order);
            // Remove from basket
            i.setBasket(null);
            // update item
            i.update();

            Ticket t = i.getTicket();
            t.decreaseQuantity(i.getQuantity());
            t.update();
        }

        // Update the order
        order.update();

        // Clear and update the shopping basket
        u.getBasket().setBasketItems(null);
        u.getBasket().update();

        // Show order confirmed view
        return ok(orderConfirmed.render(u, order));
    }

    // View an individual order
    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render(getCurrentUser(), order));
    }

}