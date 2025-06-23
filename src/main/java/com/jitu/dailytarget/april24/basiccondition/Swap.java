package com.jitu.dailytarget.april24.basiccondition;



// 1) Write a Java program to swap two numbers using a third variable.

public class Swap {
   static int a = 10;
    static int b = 20;

    public static void main(String[] args) {

        System.out.println("Value of a and be before swapping: " + a +" " + b);

        int temp = a;  // temp = a = 10
        a= b;          // a = b = 20
        b= temp;       // b = temp = 10
        System.out.println("Value of a and be after swapping: " + a +" " + b);
    }
}
