package models.users;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.*;
import play.data.validation.*;
import models.shopping.*;
import models.*;

@Entity
public class User extends Model {

    @Id
    @Constraints.Required
    private String email;
    private String role;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private  String password;

    private String street1;
    private String street2;
    private String town;
    private String postCode;
    private String creditCard;

    @OneToOne(mappedBy="user", cascade = CascadeType.ALL)
    private Basket basket;

    @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;

    public User(String email, String role, String name, String password) {
        this.email = email;
        this.role = role;
        this.name = name;
        this.password = password;
    }

    public User(String email, String role, String name, String password, String street1, String street2, String town, String postCode, String creditCard)
    {
        this.email = email;
        this.role = role;
        this.name = name;
        this.password = password;
        this.street1 = street1;
        this.street2 = street2;
        this.town = town;
        this.postCode = postCode;
        this.creditCard = creditCard;
    }

    public User(List<ShopOrder> orders) {
        this.orders = orders;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }

    public static Finder<String,User> find = new Finder<String,User>(User.class);

    public static List<User> findAll(){
        return User.findAll();
    }

    public static User authenticate(String email,String password){
        return find.where().eq("email",email).eq("password",password).findUnique();
    }

    public static User getUserById(String id){
        if(id == null){
            return null;
        }else{
            return find.byId(id);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
