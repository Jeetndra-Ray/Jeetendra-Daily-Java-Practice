package com.jitu.dailytarget.april27.customeexceptionh.ageexception;

//Create a custom exception InvalidAgeException that is thrown if age is less than 18.

public class AgeException extends RuntimeException {
    public AgeException(String message){
        super(message);
    }
}
