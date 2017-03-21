package models;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class EventCategory extends  Model {

    @Id
    // Foreign Key
    private Long eventID;

    @Constraints.Required
    // Foreign Key
    private Long catID;

    public EventCategory() {
    }

    public EventCategory(Long eventID, Long catID) {
        this.eventID = eventID;
        this.catID = catID;
    }

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Long getCatID() {
        return catID;
    }

    public void setCatID(Long catID) {
        this.catID = catID;
    }
}
