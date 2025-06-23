package com.jitu.dailytarget.april30.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// Write a program to read an integer from the user using Scanner.
// If the input is not an integer, catch InputMismatchException.

public class ScannerHandeling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error: That is not a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
