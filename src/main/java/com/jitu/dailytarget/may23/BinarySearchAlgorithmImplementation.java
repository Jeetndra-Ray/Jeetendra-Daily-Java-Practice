package com.jitu.dailytarget.may23;

/*Given an array of integers nums which is sorted in ascending order,and an integer target,write a function to search target in nums.If target exists,then return its index.Otherwise,return-1.

        You must write an algorithm with O(log n)runtime complexity.

        Example 1:

        Input:nums=[-1,0,3,5,9,12],target=9
        Output:4
        Explanation:9exists in nums and its index is 4
        Example 2:

        Input:nums=[-1,0,3,5,9,12],target=2
        Output:-1
        Explanation:2does not exist in nums so return-1*/

public class BinarySearchAlgorithmImplementation {
    public static int binarySearchAlgorithmImplementation(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 3, 5, 6};
        System.out.println(binarySearchAlgorithmImplementation(nums, 5));
    }
}
