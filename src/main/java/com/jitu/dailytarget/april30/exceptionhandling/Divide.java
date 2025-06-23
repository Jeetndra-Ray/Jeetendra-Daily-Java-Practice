package com.jitu.dailytarget.april30.exceptionhandling;

//Write a method divide(int a, int b) that throws ArithmeticException when b is 0. Handle the exception in main.

public class Divide {
    public static int divide(int a, int b){
        if (b==0){
            throw new ArithmeticException();
        } else
        return a/b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(4,0));
        }catch (ArithmeticException e){
            System.out.println("Divider can not be 0");
        }
    }
}
