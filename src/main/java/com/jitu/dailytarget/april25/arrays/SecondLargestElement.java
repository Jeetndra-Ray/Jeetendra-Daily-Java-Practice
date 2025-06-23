package com.jitu.dailytarget.april25.arrays;

// 14) Find the second-largest element in an array.

public class SecondLargestElement {

    public static void main(String[] args) {
        int a [] = {33,44,6,79};
        int max= a[0];
        int max2 = a[0];
        for (int i = 0;i< a.length;i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        for (int i = 0; i<a.length;i++){
            if (max2 < a[i]  && a[i] != max) {
                max2 = a[i];
            }
        }
        System.out.println("The Fist Largest Element is: "+max);
        System.out.println("The Second Largest Element is: "+max2);
    }
}
