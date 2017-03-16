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
    private String description;
    @Constraints.Required
    private String time;
    @Constraints.Required
    private String location;
    @Constraints.Required
    private Date date;

    public Event() {}

    public Event(Long eventID, String eventName, String description, String time, String location, Date date) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.description = description;
        this.time = time;
        this.location = location;
        this.date = date;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
