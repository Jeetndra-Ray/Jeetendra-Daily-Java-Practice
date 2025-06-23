package com.jitu.dailytarget.april25.basicandmath;

// 22) Check if a given 3 digit number is an Armstrong number.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please Enter Three digit number only");
            int input = scanner.nextInt();
            int result= 0;
            int temp_number = input; // we will use temp variable number so that real input will not override by 0;
            while (temp_number>0){
                int tem = temp_number % 10;
                result += Math.pow(tem, 3);
                temp_number=temp_number/10;
            }
            if (result==input){
                System.out.println(input + " is an Armstrong number.");
            }
            else System.out.println(input + " is not an Armstrong number.");

        }catch (InputMismatchException e){
            System.out.println("Please Enter Three digit number only :)");
        }
        scanner.close();
    }
}
