package com.jitu.dailytarget.april24.Arrays;
// 12 Find the sum of all elements in an array.

public class SumElements {
    public static void main(String[] args) {

        int a[] = {3,5,7,35,4};
        int sum = 0;

        for (int i = 0; i<a.length;i++){
            sum = sum+a[i];
        }
        System.out.println(sum);
    }
}
