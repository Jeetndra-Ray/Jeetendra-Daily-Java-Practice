package com.jitu.dailytarget.april25.oops.inheritance.inheritance3;
// 1) Create a Car class with fields like brand, model, and year. Write a program to create objects and display their data.

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand of the Car is: " + brand);
        System.out.println("Model of the Car is: " + model);
        System.out.println("Year in which Car Was Launch is: " + year);

    }

}

