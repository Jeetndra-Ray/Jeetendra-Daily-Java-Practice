package com.jitu.dailytarget.april30.supercall;

public class Car extends Vehicle {

    String carNumber;

    public Car(String vehicletype, String vehiclename, String carnumber) {
        super(vehicletype, vehiclename);
        this.carNumber=carnumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Vehicle Number is : " + carNumber );
    }
}
