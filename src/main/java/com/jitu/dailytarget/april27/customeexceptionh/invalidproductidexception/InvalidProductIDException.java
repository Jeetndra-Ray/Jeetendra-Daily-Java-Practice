package com.jitu.dailytarget.april27.customeexceptionh.invalidproductidexception;

//Create a custom checked exception InvalidProductIDException when a product ID is invalid.



public class InvalidProductIDException extends Exception {
    public InvalidProductIDException(String message){
        super(message);
    }
}
