package com.jitu.dailytarget.april30.constructordisappears;

public class ConstructorDisappears {
    private String message;

    // Parameterized constructor
    public ConstructorDisappears(String message) {
        this.message = message;
    }

    // Uncommenting the line below will fix the error:
    // public Example() {
    //     this.message = "Default message";
    // }

    public void display() {
        System.out.println("Message: " + message);
    }
}
