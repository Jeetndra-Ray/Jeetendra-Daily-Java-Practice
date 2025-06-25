package com.jitu.dailytarget.june25.basicrecursion;
//  printing numbers from 1 to 5 Using Recursion:
// Source: https://www.youtube.com/watch?v=M2uO2nMT0Bk&t=1101s
public class PrintingNumbersRecursion {
    public static void printingNumbersUsingRecursionDecreasingOrder(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printingNumbersUsingRecursionDecreasingOrder(n-1);
    }
    public static void printingNumbersUsingRecursionIncreasingOrder(int n){
        if (n==0){
            return;
        }
        printingNumbersUsingRecursionIncreasingOrder(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printingNumbersUsingRecursionIncreasingOrder(5);
        System.out.println("**********************");
        printingNumbersUsingRecursionDecreasingOrder(5);
    }

}
