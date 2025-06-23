package com.jitu.dailytarget.may12.abstractemployee;

public class ContractEmployee extends Employee {
    float hourlySalary;

    public ContractEmployee(int id,String name,float salary){
        super(id,name);
        this.hourlySalary =salary;
    }

    @Override
    public void calculateSalary() {
        float annualSalary=hourlySalary*40*26;
        System.out.println("Your Total salary for this contract is : " + annualSalary);
    }
}
