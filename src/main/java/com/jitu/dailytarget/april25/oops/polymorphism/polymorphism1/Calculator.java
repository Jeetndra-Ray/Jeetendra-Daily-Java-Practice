package com.jitu.dailytarget.april25.oops.polymorphism.polymorphism1;

// Implement method overloading in a Calculator class for addition (2 int, 2 double, 3 int).


public class Calculator {

    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Main method to test the overloading
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Testing different add methods
        System.out.println("Addition of two ints: " + calc.add(5, 10));          // 15
        System.out.println("Addition of two doubles: " + calc.add(5.5, 10.2));   // 15.7
        System.out.println("Addition of three ints: " + calc.add(1, 2, 3));      // 6
    }
}




