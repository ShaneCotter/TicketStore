package models;

import java.util.*;
import javax.persistence.*;

import javax.validation.Constraint;


import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;


@Entity
public class Ticket extends Model {


    @Id
    private Long ticket_id;


    @Constraints.Required
    private String ticket_type;

    @Constraints.Required
    private int quantity;


    @Constraints.Required
    private double price;

    @ManyToOne
    private Event event;

    public Ticket() {
    }

    public Ticket(Long ticketID, String ticketType, int quantity, double price) {
        this.ticket_id = ticketID;
//      this.event_id = eventID;
        this.ticket_type = ticketType;
        this.quantity = quantity;
    }


    public Long getTicketID() {
        return ticket_id;
    }

    public void setTicketID(Long ticketID) {
        this.ticket_id = ticketID;
    }


//    public Long getEventID() {
//        return event_id;
//    }
//
//    public void setEventID(Long eventID) {
//        this.event_id = eventID;
//    }

    public String getTicketType() {
        return ticket_type;
    }

    public void setTicketType(String ticketType) {
        this.ticket_type = ticketType;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Finder<Long,Ticket> find = new Finder<Long, Ticket>(Ticket.class);

    // Find all Events in the database
    // Filter event name
    public static List<Ticket> findAll() {
        return Ticket.find.all();
    }
}
