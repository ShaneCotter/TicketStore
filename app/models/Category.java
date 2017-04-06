package models;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Category extends Model {

    @Id
    private Long catID;

    @Constraints.Required
    private String name;

    @OneToMany
    private List<Event> events;

    public Category() {
    }

    public Category(Long catID, String catName) {
        this.setCatID(catID);
        this.name = name;
    }

    public Long getCatID() {
        return catID;
    }

    public void setCatID(Long catID) {
        this.catID = catID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public static Finder<Long,Category> find = new Finder<Long,Category>(Category.class);

    public static List<Category> findAll() {
        return Category.find.where().orderBy("name asc").findList();
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>();

        for(Category c: Category.findAll()){
            options.put(c.getCatID().toString(), c.getName());
        }
        return options;
    }
}
