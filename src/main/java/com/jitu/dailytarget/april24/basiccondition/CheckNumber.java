package com.jitu.dailytarget.april24.basiccondition;

// 4) Check if a number is positive, negative, or zero.

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Number");
        try {
            int a = scanner.nextInt();
            if (a == 0){System.out.println("Enter Number is a Zero");}
            if (a<0){System.out.println("Enter Number is a Negative Number");}
            else System.out.println("Enter Number is Positive Number");
        }
        catch (InputMismatchException e){
            System.out.println("Please Enter Positive, Negative, or Zero Number Only :)");
        }
        scanner.close();
    }



}
