package com.jitu.dailytarget.april27.abstraction.appliance;

public class Fan extends Appliance{
    @Override
    public void turnOn() {
        System.out.println("Fan On");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan Off");
    }
}
