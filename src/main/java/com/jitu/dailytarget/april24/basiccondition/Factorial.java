package com.jitu.dailytarget.april24.basiccondition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

 // 2) Write a program to find the factorial of a number using a for loop.

    public static void main(String[] args) {
     // Scanner scanner = new Scanner(System.in);
       // System.out.println("Please enter the number:");
        try {
            int  a = 5;
            int factorial = 1;  // My approach was factorial = a
            for (int i = 1;i<=a; i++){
            factorial  = factorial*i;
            }
            System.out.println("The Factorial of the Number: " + a + " is  " + factorial);
        } catch (InputMismatchException e){
            System.out.println("Please Enter Only Positive Number:)");
        }
        //scanner.close();
    }

}
