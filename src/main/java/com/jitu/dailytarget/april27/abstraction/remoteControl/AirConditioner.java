package com.jitu.dailytarget.april27.abstraction.remoteControl;

public class AirConditioner implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioner is now OFF.");
    }
}
