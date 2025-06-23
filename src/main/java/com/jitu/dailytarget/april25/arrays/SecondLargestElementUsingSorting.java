package com.jitu.dailytarget.april25.arrays;

// // 19) Find the second-largest element in an array using sort method.

import java.util.Arrays;

public class SecondLargestElementUsingSorting {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 10, 34, };
        Arrays.sort(arr);
        int n = arr.length;
        int second_Largest_Element = arr[0];
        for (int i = n -2; i >= 0; i--) {
            // return the first element which is not equal to the
            // largest element
            if (arr[i] != arr[n - 1]) {
                second_Largest_Element = arr[i];
            }

        }
        System.out.println(second_Largest_Element);

    }
}
