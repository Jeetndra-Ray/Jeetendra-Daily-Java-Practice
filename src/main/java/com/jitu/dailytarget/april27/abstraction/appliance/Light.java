package com.jitu.dailytarget.april27.abstraction.appliance;

public class Light extends Appliance{
    @Override
    public void turnOn() {
        System.out.println("Light On");
    }

    @Override
    public void turnOff() {
        System.out.println("Light Off");
    }
}
