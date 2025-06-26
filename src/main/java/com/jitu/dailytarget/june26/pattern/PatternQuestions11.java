package com.jitu.dailytarget.june26.pattern;

public class PatternQuestions11 {
    public static void main(String[] args) {
        int n=5;
        for (int i =n;i>=1;i--){
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
