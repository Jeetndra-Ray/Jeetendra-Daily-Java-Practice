package com.jitu.dailytarget.april25.loopsandpattern;

// 26) Print all prime numbers between 1 to 100.

public class PrimeNumber {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(i + ",");
            }
        }
    }
}

