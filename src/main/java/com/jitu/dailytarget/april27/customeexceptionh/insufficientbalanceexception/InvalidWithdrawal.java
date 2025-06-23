package com.jitu.dailytarget.april27.customeexceptionh.insufficientbalanceexception;

public class InvalidWithdrawal extends RuntimeException{
    public InvalidWithdrawal (String message){
   super(message);
    }
}
