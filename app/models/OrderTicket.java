package models;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class OrderTicket extends  Model {
    @Id
    // Foreign Key
    private Long ticketID;

    @Constraints.Required
    // Foreign Key
    private Long orderID;

    @Constraints.Required
    private int quantity;

    @Constraints.Required
    private double cost;

    public OrderTicket() {
    }

    public OrderTicket(Long ticketID, Long orderID, int quantity, double cost) {
        this.ticketID = ticketID;
        this.orderID = orderID;
        this.quantity = quantity;
        this.cost = cost;
    }

    public Long getTicketID() {
        return ticketID;
    }

    public void setTicketID(Long ticketID) {
        this.ticketID = ticketID;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
