package com.jitu.dailytarget.april29.corejavalogical;

public class DemonstrateThrowThrows1 {
    public static void checkAge(int age) throws ArithmeticException {
        System.out.println("This is first line of code of method");
        System.out.println(age/0);
        System.out.println("This is third line of code of method");
    }

    public static void main(String[] args) {
        System.out.println("This is first line of code");
        checkAge(2);
        System.out.println("This is third line of code");
    }
}
