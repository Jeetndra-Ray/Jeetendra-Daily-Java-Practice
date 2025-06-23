package com.jitu.dailytarget.april24.basiccondition;

//5) Calculate the sum of digits of a given number.

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int sumofdigits = 0;
        int num;
        try {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            while (num>0){
                int tem = num%10;
                num=num/10;
                sumofdigits = sumofdigits+tem;
            }
            System.out.println(sumofdigits);
            scanner.close();
        } catch (InputMismatchException e){
            System.out.println("Please Enter Number Only :)");

        }

    }
}
