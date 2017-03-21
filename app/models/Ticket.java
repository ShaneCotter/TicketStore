package models;

import java.util.*;
import javax.persistence.*;
<<<<<<< HEAD
import javax.validation.Constraint;

=======
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

<<<<<<< HEAD
@Entity
public class Ticket extends Model {
=======

@Entity
public class Ticket extends  Model {
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0

    @Id
    private Long ticketID;

<<<<<<< HEAD
    // Foreign Key
    private Long eventID;

=======
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0
    @Constraints.Required
    private String ticketType;

    @Constraints.Required
<<<<<<< HEAD
    private int quantity;
=======
    private int qty;
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0

    @Constraints.Required
    private double price;

<<<<<<< HEAD
    public Ticket() {
    }

    public Ticket(Long ticketID, Long eventID, String ticketType, int quantity, double price) {
        this.ticketID = ticketID;
        this.eventID = eventID;
        this.ticketType = ticketType;
        this.quantity = quantity;
=======
    // Make this a Foreign Key
    private Long eventID;

    public Ticket() {
    }

    public Ticket(Long ticketID, String ticketType, int qty, double price) {
        this.ticketID = ticketID;
        this.ticketType = ticketType;
        this.qty = qty;
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0
        this.price = price;
    }

    public Long getTicketID() {
        return ticketID;
    }

    public void setTicketID(Long ticketID) {
        this.ticketID = ticketID;
    }

<<<<<<< HEAD
    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

=======
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

<<<<<<< HEAD
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
=======
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
