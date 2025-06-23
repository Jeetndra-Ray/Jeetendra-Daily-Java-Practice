package com.jitu.dailytarget.april24.loopsandpattern;

// 9)  Count the number of digits in a given number.

import java.util.InputMismatchException;
import java.util.Scanner;

public class CountNumberDigit {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please Enter Number ");
            int num = scanner.nextInt();
            while (num>0){
                num = num/10;
                count++;}
        } catch (InputMismatchException e){
            System.out.println("Please enter valid number");
            e.printStackTrace();
        }
        System.out.println(count);
        scanner.close();
    }
}
