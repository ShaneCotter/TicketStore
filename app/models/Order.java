package models;


import java.util.*;
import javax.persistence.*;

import java.util.*;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;


import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Order  extends  Model {


    @Id
    private Long orderID;


    // Foreign Key
    private Long userID;

    @Constraints.Required
    private Date orderDate;


    @Constraints.Required
    private double totalCost;


    public Order(Long orderID, Date orderDate, double totalCost) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.totalCost = totalCost;
    }


    public Order() {
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getOrderID() {

        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }


    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {this.orderDate = orderDate;}


    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
