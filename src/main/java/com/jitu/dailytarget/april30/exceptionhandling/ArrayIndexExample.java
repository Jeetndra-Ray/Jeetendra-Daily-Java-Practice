package com.jitu.dailytarget.april30.exceptionhandling;

import java.util.Scanner;

public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Array with 5 elements
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an index to access (0 to 4): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter a value between 0 and 4.");
        } finally {
            scanner.close();
        }
    }
}
