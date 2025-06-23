package com.jitu.dailytarget.may20.linearsearchquestion;

import java.util.ArrayList;
import java.util.List;

public class EvenDigits {

    public static void main(String[] args) {

        int[] arr = new int[]{12, 1, 143, 1234,};

/*        System.out.println(10/2);
        System.out.println(1/10);
        System.out.println(2/5);
        System.out.println(2/10);

        System.out.println(10%2);
        System.out.println(1%10);
        System.out.println(2%5);
        System.out.println(2%10);*/

        //approachOneUsingStringConversion(arr);
        System.out.println("Total Even Digits in the Array: " + approachThreeUsingLog(arr));

    }

    private static void approachOneUsingStringConversion(int[] arr) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                integers.add(arr[i]);
            }
        }
        integers.forEach(System.out::println);
    }

    private static boolean isEven(int input) {
        return String.valueOf(input).length() % 2 == 0;
    }

    static int approachTwoUsingModulo(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int count1 = 0;
            while (arr[i] > 0) {
                arr[i] = arr[i] / 10;
                count1++;
            }
            if (count1 % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int  approachThreeUsingLog(int arr[]){
        int count=0;
        for (int i : arr){
            if (isEven2(i)){
                count++;
            }
        }
        return count;
    }

    static boolean isEven2(int num){
        int numbesdigit=digit(num);
        return numbesdigit%2==0;
    }
    static int digit(int num){
        if (num<0){
            num=num*-1;
        }
        return (int) (Math.log10(num))+1;
    }

}
