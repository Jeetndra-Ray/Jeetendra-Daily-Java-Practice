package com.jitu.dailytarget.april30.exceptionhandling;

public class InvalidAgeException  extends RuntimeException{
    public InvalidAgeException( String message){
        super(message);
    }
}
