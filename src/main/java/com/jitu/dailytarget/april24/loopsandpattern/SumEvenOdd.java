package com.jitu.dailytarget.april24.loopsandpattern;

// 11) Print the sum of even and odd numbers between 1 to N.

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumEvenOdd {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int even = 0;
            int odd = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println("Total number of even " + even + " Total Number of Odd " + odd);
            scanner.close();
        } catch (InputMismatchException e){
            System.out.println("Please Enter Number Only :)");
        }
    }

}
