package com.jitu.dailytarget.april30.constructorschaining;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Jeetu");
        Student student1 = new Student("ceeku",23);
        Student student2 = new Student("Neetu",21,"BBA");

        student.displayDetails();
        student1.displayDetails();
        student2.displayDetails();

    }
}
