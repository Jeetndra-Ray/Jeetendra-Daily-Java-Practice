package com.jitu.dailytarget.april29.accessmodifierstest;

import com.jitu.dailytarget.april29.accessmodifiers.Car;

public class Main {
    public static void main(String[] args) {
       Car car = new Car();
     //  car.startEngine();//// compile time error
        // default access works only within the same package not with other package .
    }
}
