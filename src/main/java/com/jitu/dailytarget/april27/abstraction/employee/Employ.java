package com.jitu.dailytarget.april27.abstraction.employee;

// Create an abstract class Employee with an abstract method calculateSalary() and a concrete method displayDetails().

abstract class Employ {

    String name;
    int employeeId;

    public Employ(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract void  calculateSalary();
    public void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }

}
