package com.jitu.dailytarget.april26.exceptionhandling;

// Create a program that reads an integer from the user and catches InputMismatchException.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mismatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please Enter Integer Only");
            int integer = scanner.nextInt();
            System.out.println(integer);
        }catch (InputMismatchException e){
            System.out.println("Please Enter Integer Value only :)");
        }
    }

}
