package com.jitu.dailytarget.may17;

// Write a program to find the largest and smallest element in an array.

public class LargestSmallest {
    public static void largesSmallest(int arr[]) {
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, 8, 9};
     largesSmallest(arr);
    }
}
