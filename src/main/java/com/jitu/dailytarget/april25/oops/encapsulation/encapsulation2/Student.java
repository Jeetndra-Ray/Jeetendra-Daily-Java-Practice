package com.jitu.dailytarget.april25.oops.encapsulation.encapsulation2;

// Create a Student class with private fields and methods to set and get student details using constructor and getter/setter.

public class Student {

    private String name;
    private int age;
    private int rollNumber;


    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }



    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public int getRollNumber() {
        return rollNumber;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

