package com.jitu.dailytarget.april26.oops.encapsulation.encapsulation3;

public class User {
    private String username;
    private String password;

    public User(String username,String password){
        this.username=username;
        setPassword(password);
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
       if (password.length()>=8){
           this.password = password;
       }else System.out.println("Error: Password must be at least 8 characters long.");
    }

    public String getPassword() {
        return "Access Denied: Password is confidential.";
    }

    public void displayInfo(){
        System.out.println("Username: " + username);
        System.out.println("Password: "+ password);
    }
}
