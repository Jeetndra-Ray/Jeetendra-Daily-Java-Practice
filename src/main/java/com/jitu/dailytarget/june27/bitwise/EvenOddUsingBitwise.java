package com.jitu.dailytarget.june27.bitwise;

public class EvenOddUsingBitwise {
    public static void evenOddUsingBitwise(int number){
        if ((number&1)==1){
            System.out.println("It is a Odd Number");
        }
        else System.out.println("It is a Even Number");
    }
    public static void main(String[] args) {
        evenOddUsingBitwise(43);
    }
}
