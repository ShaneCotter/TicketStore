package models.users;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.*;
import play.data.validation.*;

@Entity
public class User extends Model {

    @Id
    @Constraints.Required
    private String email;
    @Constraints.Required
    private String role;
    @Constraints.Required
    private String username;
    @Constraints.Required
    private String address1;
    @Constraints.Required
    private String address2;
    @Constraints.Required
    private String town;
    @Constraints.Required
    private String city;
    @Constraints.Required
    private String securityAns;
    @Constraints.Required
    private  String password;

    public User(String email, String role, String username, String address1, String address2, String town, String city, String securityAns, String password) {
        this.email = email;
        this.role = role;
        this.username = username;
        this.address1 = address1;
        this.address2 = address2;
        this.town = town;
        this.city = city;
        this.securityAns = securityAns;
        this.password = password;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSecurityAns() {
        return securityAns;
    }

    public void setSecurityAns(String securityAns) {
        this.securityAns = securityAns;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
