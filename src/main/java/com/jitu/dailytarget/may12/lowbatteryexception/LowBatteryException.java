package com.jitu.dailytarget.may12.lowbatteryexception;

public class LowBatteryException extends RuntimeException{
    public LowBatteryException(String message){
        super(message);
    }
}
