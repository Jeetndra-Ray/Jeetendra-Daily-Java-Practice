package com.jitu.dailytarget.april26.oops.abstraction;

//Create an abstract class Employee with an abstract method calculateSalary() and a concrete method displayDetails().

public abstract class Employee {
    public abstract void  calculateSalary();
    public void displayDetails(){
        System.out.println("Displaying salary ");
    }

}
