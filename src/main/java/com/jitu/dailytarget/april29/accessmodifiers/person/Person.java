package com.jitu.dailytarget.april29.accessmodifiers.person;

// 1. Create a class Person with private fields name and age. Write public getter and setter methods for both fields.

public class Person {

    private int age ;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
