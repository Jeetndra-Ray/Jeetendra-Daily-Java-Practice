package com.jitu.dailytarget.april27.customeexceptionh.insufficientbalanceexception;

//Write a program where you define and throw a custom exception InsufficientBalanceException for a Bank Account withdrawal.

public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException (String message){
        super(message);
    }
}
