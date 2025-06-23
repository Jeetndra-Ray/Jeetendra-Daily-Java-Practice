package com.jitu.dailytarget.april27.abstraction.employee;

import com.jitu.dailytarget.april27.abstraction.employee.Employ;

public class Employee extends Employ {
    int week_salary;
    public Employee(String name, int employeeId, int salary) {
        super(name, employeeId);
        this.week_salary =salary;
    }
    @Override
    public void calculateSalary() {
        System.out.println("Your Monthly Salary is :  "+week_salary*4);

    }
}
