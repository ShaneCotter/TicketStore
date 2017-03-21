package models;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class eventCategory extends  Model{

    @Id
    // Make this a Foreign Key
    private Long eventID;

    @Constraints.Required
    // Make this a Foreign Key
    private Long catID;


}
