package com.jitu.dailytarget.april27.abstraction.vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Bike();
        vehicle.start();
        vehicle.stop();
        Car car= new Car();
        car.start();
        car.stop();
    }
}
