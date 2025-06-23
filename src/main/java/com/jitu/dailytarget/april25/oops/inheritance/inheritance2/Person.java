package com.jitu.dailytarget.april25.oops.inheritance.inheritance2;

// Design a class Person and derive  Employee class that adds salary and department.

public class Person {
     String name;
     int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
