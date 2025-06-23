package com.jitu.dailytarget.april24.loopsandpattern;

// 7) Print a right-angled triangle pattern using *.

public class RightAngledPattern {

    public static void main(String[] args) {

        for (int i = 1;i<=5; i++){
            for (int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
