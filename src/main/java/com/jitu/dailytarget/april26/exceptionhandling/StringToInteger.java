package com.jitu.dailytarget.april26.exceptionhandling;

// Write a program to convert a string to an integer using Integer.parseInt() and handle NumberFormatException.

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scr=  scanner.next();

        try {
            int number = Integer.parseInt(scr);
            System.out.println("The integer value is: " + number);
        }catch (NumberFormatException e){
            System.out.println("Please Enter Number Only :)");
        }
        scanner.close();
    }
}
