package com.jitu.dailytarget.april25.oops.encapsulation.encapsulation2;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ram Yadav", 13, 45);

        student1.displayInfo();
        // Now if we want to modify the student1 we can do it because we have also added setter and getter
        student1.setName("Sam Yadav");
        student1.setAge(15);
        student1.setRollNumber(34);
        student1.displayInfo();
    }
}
