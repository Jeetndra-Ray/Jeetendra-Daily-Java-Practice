package com.jitu.dailytarget.may12.interfaceremotecontrol;

public class AC implements RemoteControl {

    @Override
    public void powerOff() {
        System.out.println("AC is Getting On");
    }

    @Override
    public void powerOn() {
        System.out.println("AC is Getting Of");
    }
}
