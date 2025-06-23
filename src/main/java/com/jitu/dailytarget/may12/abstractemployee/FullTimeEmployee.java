package com.jitu.dailytarget.may12.abstractemployee;

public class FullTimeEmployee extends Employee {
    float hourlySalary;
    public FullTimeEmployee(int id,String name,float salary){
        super(id,name);
        this.hourlySalary =salary;
    }
    @Override
    public void calculateSalary() {
        float annualSalary=hourlySalary*40*52;
        System.out.println("Your Annual salary is : " + annualSalary);
    }
}
