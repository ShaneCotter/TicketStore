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
    private String catName;

    public Category() {
    }

    public Category(Long catID, String catName) {
        this.catID = catID;
        this.catName = catName;
    }

    public Long getCatID() {
        return catID;
    }

    public void setCatID(Long catID) {
        this.catID = catID;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
