package com.jitu.dailytarget.april26.exceptionhandling;

//  Write a Java program to divide two numbers. Handle the ArithmeticException if the denominator is zero.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please Enter Dividend");
            int dividend = scanner.nextByte();
            System.out.println("Please Enter Divisor");
            int divisor = scanner.nextByte();
            int result = dividend/divisor;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Divisor or Dividend Can Not be Zero");
        }
        catch (InputMismatchException e){
            System.out.println("Please Enter Integer Value only :)");
        }
        scanner.close();
    }
}
