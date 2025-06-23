package com.jitu.dailytarget.april29.accessmodifiers.person;

import com.jitu.dailytarget.april29.accessmodifiers.Car;
import com.jitu.dailytarget.april29.accessmodifiers.animal.Animal;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
       // car.startEngine();//// compile time error


        // default access works only within the same package not even with sub package or childclass .

    }
}
