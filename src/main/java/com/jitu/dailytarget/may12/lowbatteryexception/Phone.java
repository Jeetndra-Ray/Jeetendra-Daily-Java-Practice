package com.jitu.dailytarget.may12.lowbatteryexception;

public class Phone {
    int battery;

    public void setBattery(int battery) {
        this.battery = battery;
    }
    public void display(){
        if (battery<=10){
            throw new LowBatteryException("Phone Battery is Low");}
       else {System.out.println(battery);}
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.battery=7;
        try {
            phone.display();
        }catch (LowBatteryException e){
            System.out.println(e.getMessage());
        }

    }
}
