package com.jitu.dailytarget.april25.basicandmath;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculater {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please Enter A Number");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Please Enter Operators ");
            char op = scanner.next().charAt(0);
            if (op == '+') {
                System.out.println(a + b);
            }
            if (op == '-') {
                System.out.println(a - b);
            }
            if (op == '*') {
                System.out.println(a * b);
            }
            if (op == '/') {
                System.out.println(a / b);
            }
            if (op == '%') {
                System.out.println(a % b);
            }
        } catch (InputMismatchException e){
            System.out.println("Please Enter Number Only");
        }
    }

}
