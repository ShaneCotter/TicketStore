package models;


import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;


@Entity
public class Event extends Model {

    @Id
    private Long id;

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
        this.setId(eventID);
        this.setEventName(eventName);
        this.time = time;
        this.location = location;
        this.date = date;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long eventID) {
        this.id = eventID;
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

    public static List<Event> findAllS(String filter) {
        return Event.find.where()
                .ilike("eventName", "%" + filter + "%")
                .orderBy("eventName asc")
                .findList();
    }

    public static List<Event> findFilter(Long catID, String filter) {
        return Event.find.where()
                .eq("categories.catID", catID)
                .ilike("eventName", "%" + filter + "%")
                .orderBy("eventName asc")
                .findList();
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
            options.put(e.getId().toString(),e.getEventName());
        }
        return options;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

        public String calcLowestPrice(){
          double lowestPrice = 11111111111111.00;



        if(getTickets().size() > 0){
            List<Ticket> tickets = getTickets();

            for(int i =0; i< getTickets().size(); i++)
            {

                Ticket t = tickets.get(i);
                if(t.getPrice() < lowestPrice)
                {
                    lowestPrice = t.getPrice();
                }
            }
        } else{
            return "No tickets available";
        }

        return String.format("Starting from €%.2f", lowestPrice);
    }
}
