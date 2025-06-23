package com.jitu.dailytarget.april26.exceptionhandling;

import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch block: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (no exception)");
        }
    }
}
