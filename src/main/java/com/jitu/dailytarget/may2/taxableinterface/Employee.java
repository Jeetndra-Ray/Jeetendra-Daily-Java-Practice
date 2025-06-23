package com.jitu.dailytarget.may2.taxableinterface;

public class Employee implements Taxable{


    private float annualSalary;

    public Employee(float annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public float  calculateTax() {
        return annualSalary*0.40f;
    }
}
