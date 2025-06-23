package com.jitu.dailytarget.may12.interfaceremotecontrol;

public class TV implements RemoteControl {
    @Override
    public void powerOn() {
        System.out.println("TV is Getting On");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is Getting Of");
    }
}
