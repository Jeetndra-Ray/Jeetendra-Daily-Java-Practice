package com.jitu.dailytarget.april26.exceptionhandling;

// Write a program that catches both ArithmeticException and NullPointerException separately.

public class CatchMultipleExceptions {
    public static void main(String[] args) {
        try {
            String text = null;
            // This will throw NullPointerException
            int length = text.length();

            System.out.println("Operation completed successfully.");
        }
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block always runs.");
        }
        try {
            // This will throw ArithmeticException
             int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
