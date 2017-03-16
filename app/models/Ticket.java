package models;


import java.util.Date;
import java.util.stream.Stream;

public class Ticket {               // Product Class

    private Long ticketID;
    private String ticketType;
    private int quantity;
    private double price;
    private String description;
    private int stock;
    private String location;
    private Date date;
    private Date time;


    public Ticket() {}

    public Ticket(Long ticketID, String ticketType, int quantity, double price, String description,
                  int stock, String location, Date time, Date date) {
        this.ticketID = ticketID;
        this.ticketType = ticketType;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.location = location;
        this.time = time;
        this.date = date;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
