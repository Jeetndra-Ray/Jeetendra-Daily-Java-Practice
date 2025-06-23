package com.jitu.dailytarget.april24.basiccondition;

// 1) Write a Java program to swap two numbers without using a third variable.


public class Swap1 {

    static int a = 10;
    static int b = 20;

    public static void main(String[] args) {

        System.out.println("Value of a and be before swapping: " + a +" " + b);

        a= a+b; // a = a+b = 10+20 = 30
        b= a-b; // b = a-b = 30-20 = 10
        a= a-b; // a = a-b = 30-10 = 20
        System.out.println("Value of a and be after swapping: " + a +" " + b);
    }


}
