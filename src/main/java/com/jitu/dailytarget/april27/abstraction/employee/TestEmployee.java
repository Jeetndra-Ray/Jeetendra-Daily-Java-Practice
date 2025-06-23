package com.jitu.dailytarget.april27.abstraction.employee;

import com.jitu.dailytarget.april27.abstraction.employee.Employ;
import com.jitu.dailytarget.april27.abstraction.employee.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employ employ = new Employee("Ram",23,3999);
        employ.displayDetails();
        employ.calculateSalary();
    }
}
