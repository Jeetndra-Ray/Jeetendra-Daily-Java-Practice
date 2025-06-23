package com.jitu.dailytarget.april27.abstraction.remoteControl;

public class Television implements RemoteControl{
    public void turnOn() {
        System.out.println("Television is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is now OFF.");
    }
}
