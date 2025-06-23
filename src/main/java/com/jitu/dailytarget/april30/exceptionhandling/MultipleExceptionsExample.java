package com.jitu.dailytarget.april30.exceptionhandling;

public class MultipleExceptionsExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println("Length of string: " + str.length());
            int result = 10 / 0;
            System.out.println("Result of division: " + result);

        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Caught a generic Exception: " + e.getMessage());
        }
    }
    }

