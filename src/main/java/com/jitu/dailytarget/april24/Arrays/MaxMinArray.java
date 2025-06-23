package com.jitu.dailytarget.april24.Arrays;

// 15) Find the maximum and minimum value of element in an array.

public class MaxMinArray {
    public static void main(String[] args) {
        int [] a = {33,44,65,2};
        int max= a[0];
        int min = a[0];
        for (int i = 0;i< a.length;i++){
           if (max < a[i]){
               max = a[i];
           }
           if (min>a[i]){
               min= a[i];
           }
        }
        System.out.println(max);
        System.out.println(min);

    }

}
