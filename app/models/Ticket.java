package models;

import java.util.*;
import javax.persistence.*;

import javax.validation.Constraint;


import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;
import models.shopping.*;


@Entity
public class Ticket extends Model {


    @Id
    private Long ticket_id;


    @Constraints.Required
    private String ticket_type;

    @Constraints.Required
    private String description;

    @Constraints.Required
    private int quantity;


    @Constraints.Required
    private double price;

    @ManyToOne
    private Event event;

    @OneToMany(mappedBy="ticket", cascade=CascadeType.ALL)
    List<OrderItem> orderItem;

    public Ticket() {
    }

    public Ticket(Long ticketID, String ticketType, int quantity, double price) {
        this.ticket_id = ticketID;
        this.ticket_type = ticketType;
        this.quantity = quantity;
        this.price = price;
    }


    public Long getTicketID() {
        return ticket_id;
    }

    public void setTicketID(Long ticketID) {
        this.ticket_id = ticketID;
    }

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

    public void decreaseQuantity(int qty){
        this.quantity -= qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Finder<Long,Ticket> find = new Finder<Long, Ticket>(Ticket.class);

    public static List<Ticket> findAll() {
        return Ticket.find.all();
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
