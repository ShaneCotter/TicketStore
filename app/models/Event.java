package models;


import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;


@Entity
public class Event extends Model {

    @Id
    private Long eventID;

    @Constraints.Required
    private String eventName;

    @Constraints.Required
    private String time;

    @Constraints.Required
    private String location;

    @Constraints.Required
    private String date;

    @Constraints.Required
    private String title; // Artist?

    @OneToMany(mappedBy="event", cascade=CascadeType.ALL)
    private List<Ticket> tickets;

    @ManyToOne
    private Category category;


    public Event() {}

    public Event(Long eventID, String eventName, String time, String location, String date, String title) {
        this.setEventID(eventID);
        this.setEventName(eventName);
        this.time = time;
        this.location = location;
        this.date = date;
        this.title = title;
    }

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Generic query helper for entity Computer with id long
    public static Finder<Long,Event> find = new Finder<Long, Event>(Event.class);

    // Find all Events in the database
    // Filter event name
    public static List<Event> findAll() {
        return Event.find.all();
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public static Finder<Long,Event> findT = new Finder<Long,Event>(Event.class);

    public static List<Event> findAllT() {
        return Event.find.where().orderBy("eventName asc").findList();
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();

        for(Event e: Event.findAllT()){
            options.put(e.getEventID().toString(),e.getEventName());
        }
        return options;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
