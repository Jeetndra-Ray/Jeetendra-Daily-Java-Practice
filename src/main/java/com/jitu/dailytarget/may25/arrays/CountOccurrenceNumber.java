package com.jitu.dailytarget.may25.arrays;

public class CountOccurrenceNumber {
    public static int countOccurrenceNumber(int number, int target){
       int count=0;
       while (number>0){
           int temp = number%10;
           if (temp==target){
               count++;
           }
           number=number/10;
       }
       return count;
    }

    public static void main(String[] args) {
        int number= 123228;
        int target = 3;
        System.out.println(countOccurrenceNumber(number,target));
    }
}
