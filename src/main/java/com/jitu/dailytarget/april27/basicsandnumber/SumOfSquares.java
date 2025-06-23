package com.jitu.dailytarget.april27.basicsandnumber;

//Find the sum of squares of digits of a number.

public class SumOfSquares {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while (num>0){
            int temp= num%10;
            sum=sum+temp*temp;
            num= num/10;
        }
        System.out.println(sum);
    }
}
