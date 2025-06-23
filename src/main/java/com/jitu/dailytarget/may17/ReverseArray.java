package com.jitu.dailytarget.may17;

//Given an array of integers, reverse the array without using a second array.

public class ReverseArray {

    public static void reverseArray(int array[]) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ",");
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 3, 4, 5, 6};
        reverseArray(array);
    }
}
