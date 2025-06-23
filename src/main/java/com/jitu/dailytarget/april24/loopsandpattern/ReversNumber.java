package com.jitu.dailytarget.april24.loopsandpattern;

// 10) Display the reverse of a number.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReversNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            int revrs= 0;
            while (num>0){
                int tem = num%10;
                num = num/10;
                revrs = revrs*10+tem;
            }
            System.out.println(revrs);
            scanner.close();
        } catch (InputMismatchException e){
            System.out.println("Please Enter Number Only :) ");
        }

    }

}
