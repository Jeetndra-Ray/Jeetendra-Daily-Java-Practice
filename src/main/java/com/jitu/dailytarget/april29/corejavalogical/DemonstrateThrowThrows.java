package com.jitu.dailytarget.april29.corejavalogical;

public class DemonstrateThrowThrows {
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // Actually throw an exception
            throw new ArithmeticException("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is first line of code");
        checkAge(2);
        System.out.println("This is third line of code");
    }
}
