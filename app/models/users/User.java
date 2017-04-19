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

//    private int phone;
//    private String birthday;

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

    public User(List<ShopOrder> orders) {
        this.orders = orders;
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
        return User.find.all();
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

    public Boolean isExisting(User u){
        Boolean existing = false;
        List<User> accountsList = User.findAll();

        for(int i =0; i < accountsList.size(); i++){

            if(u.getEmail() == accountsList.get(i).getEmail()){
                existing = true;
            }
        }
        return existing;
    }
}
