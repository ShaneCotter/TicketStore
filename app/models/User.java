package models;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class User extends Model {

    @Id
    private Long userID;

    @Constraints.Required
    private String role;
    @Constraints.Required
    private String username;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private String address1;
    @Constraints.Required
    private String address2;
    @Constraints.Required
    private String town;
    @Constraints.Required
    private String city;
//    @Constraints.Required
//    private String securityQuest;
    @Constraints.Required
    private  String password;

    public User(Long userID, String role, String username, String email, String address1,
                String address2, String town, String city, String password, String securityQuest) {
        this.userID = userID;
        this.role = role;
        this.username = username;
        this.email = email;
        this.address1 = address1;
        this.address2 = address2;
        this.town = town;
        this.city = city;
        //this.securityQuest = securityQuest;
        this.password = password;
    }

    public User() {
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

//    public String getSecurityQuest() {
//        return securityQuest;
//    }
//
//    public void setSecurityQuest(String securityQuest) {
//        this.securityQuest = securityQuest;
//    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
