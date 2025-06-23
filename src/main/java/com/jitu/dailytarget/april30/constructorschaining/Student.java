package com.jitu.dailytarget.april30.constructorschaining;

public class Student {

        private String name;
        private int age;
        private String course;


        public Student(String name) {
            this(name, 0, "Unknown");  // Chaining to Constructor 3
        }


        public Student(String name, int age) {
            this(name,age,"Unknown");
            // Chaining to Constructor 3
        }


        public Student(String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
        }


        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course);
        }

}
