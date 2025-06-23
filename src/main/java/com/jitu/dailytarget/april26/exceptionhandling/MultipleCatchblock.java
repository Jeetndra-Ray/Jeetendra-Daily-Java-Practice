package com.jitu.dailytarget.april26.exceptionhandling;

// Write a program with multiple catch blocks for ArrayIndexOutOfBoundsException, ArithmeticException, and a generic Exception

public class MultipleCatchblock {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int num = numbers[5];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Caught Generic Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block always executes.");
        }
        try {
            // This line won't be reached due to exception above,
            int result = 10 / 0; // ArithmeticException

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Caught Generic Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block always executes.");
        }
    }
}
