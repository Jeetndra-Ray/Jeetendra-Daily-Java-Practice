package com.jitu.dailytarget.june26.pattern;
/*

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *


*/

public class PatternQuestions5 {
    public static void main(String[] args) {
        for (int i =1;i<=5;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            if (i==5){ for (int i1 = i-1; i1 >=1; i1--){
                for (int j = 1; j<= i1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }}
        }
    }
}
