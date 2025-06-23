package com.jitu.dailytarget.april25.oops.inheritance.inheritance2;

public class Employee extends Person{
    private double salary;
    private String department;

    public Employee(String name, int age, double salary, String department) {
        super(name, age);
        this.salary = salary;
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }

}
