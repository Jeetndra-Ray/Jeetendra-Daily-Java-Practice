package com.jitu.dailytarget.may23;

public class CeillingOfNumber {
    public static int ceilingOfNumber(int array[], int target) {
        int star = 0;
        int end = array.length - 1;
        while (star <= end) {
            int mid = (star + end) / 2;
            if (array[mid] == target) {
                return array[mid];
            }
            if (array[mid] < target) {
                star = mid + 1;
            } else end = mid - 1;
        }
        return array[star];
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(ceilingOfNumber(arr, 17));
    }
}
