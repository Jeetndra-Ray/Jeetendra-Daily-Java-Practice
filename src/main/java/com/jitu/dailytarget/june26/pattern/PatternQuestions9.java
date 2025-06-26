package com.jitu.dailytarget.june26.pattern;

public class PatternQuestions9 {
    public static void main(String[] args) {
        int n=5;
        for (int i =5;i>=1;i--){
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=i+(i-1);k++){
                System.out.print("*");
            }
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
