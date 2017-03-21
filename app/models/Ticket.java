package models;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;


@Entity
public class Ticket extends  Model {

    @Id
    private Long ticketID;

    @Constraints.Required
    private String ticketType;

    @Constraints.Required
    private int qty;

    @Constraints.Required
    private double price;

    // Make this a Foreign Key
    private Long eventID;

    public Ticket() {
    }

    public Ticket(Long ticketID, String ticketType, int qty, double price) {
        this.ticketID = ticketID;
        this.ticketType = ticketType;
        this.qty = qty;
        this.price = price;
    }

    public Long getTicketID() {
        return ticketID;
    }

    public void setTicketID(Long ticketID) {
        this.ticketID = ticketID;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
