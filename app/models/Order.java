package models;

<<<<<<< HEAD
import java.util.*;
import javax.persistence.*;
=======

import java.util.*;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;

>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
<<<<<<< HEAD
public class Order  extends  Model {

=======
public class Order extends Model {
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0

    @Id
    private Long orderID;

<<<<<<< HEAD
    // Foreign Key
    private Long userID;

    @Constraints.Required
    private Date orderDate;
=======
    @Constraints.Required
    private String orderDate;
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0

    @Constraints.Required
    private double totalCost;

<<<<<<< HEAD
    public Order(Long orderID, Date orderDate, double totalCost) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.totalCost = totalCost;
    }
=======
    // Make this a Foreign Key
    private Long userID;
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0

    public Order() {
    }

<<<<<<< HEAD
    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getOrderID() {

=======
    public Order(Long orderID, String orderDate, double totalCost) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.totalCost = totalCost;
    }

    public Long getOrderID() {
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

<<<<<<< HEAD
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
=======
    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
>>>>>>> dff9eed82aae26005759f96140f8b9bb449d60b0
        this.orderDate = orderDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
