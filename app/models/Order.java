package models;


import java.util.*;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Order extends Model {

    @Id
    private Long orderID;

    @Constraints.Required
    private String orderDate;

    @Constraints.Required
    private double totalCost;

    // Make this a Foreign Key
    private Long userID;

    public Order() {
    }

    public Order(Long orderID, String orderDate, double totalCost) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.totalCost = totalCost;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
