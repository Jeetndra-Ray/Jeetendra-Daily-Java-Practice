package com.jitu.dailytarget.april24.Arrays;

// 16) Swap the value of two element in the array

public class Arrayswap {
    public static void main(String[] args) {

        int arr[] = {23,32,45,63,56};
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
