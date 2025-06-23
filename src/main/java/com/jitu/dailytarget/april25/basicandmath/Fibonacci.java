package com.jitu.dailytarget.april25.basicandmath;

// 24) Print fibonacci series till n term

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter The Nth Term of the ");
            int term = scanner.nextInt();
            int a = 0;
            int b = 1;
            for (int i = 0; i <= term; i++) {
              int  tem = a + b;
                a = b;
                b = tem;
                System.out.print(tem + ",");
            }
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Please Enter Number Only :)");
        }
    }
}
