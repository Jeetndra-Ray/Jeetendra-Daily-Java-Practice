package com.jitu.dailytarget.june26.pattern;
/*

 *
 **
 ***
 ****
 *****


* */
public class PatternQuestions6 {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // move to next line
            System.out.println();
        }
    }
}