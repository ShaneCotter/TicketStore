package models;


import models.users.User;

public class Login {

    private String email;
    private String password;


    public String validate(){

        if (User.authenticate(getEmail(),getPassword()) == null) {
            return "invalid user or password";
        }
        return null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
