package com.jitu.dailytarget.april29.accessmodifiers.person;

import com.jitu.dailytarget.april29.accessmodifiers.Car;

public class Main1 extends Car {
    public static void main(String[] args) {
        Car car = new Car();
        //car.startEngine(); // compile time error

        // default access works only within the same package not even with child class .

    }
}
