package models;


import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class orderTicket extends Model {

    @Id
    // Make this a Foreign Key
    private Long ticketID;

    @Constraints.Required
    // Make this a Foreign Key
    private Long orderID;

    @Constraints.Required
    private int qty;

    @Constraints.Required
    private double cost;


}
