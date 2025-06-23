package com.jitu.dailytarget.may29;

public class BinarySearchInfinityArray {


    public static int binarySearchInfinityArray(int[] num, int target) {
        int start = 0;
        int end = 1;
            while (start < end) {
                int mid = (start + end) / 2;
                if (num[mid] == target) {
                    return mid;
                }
                if (num[mid] < target) {
                    start = start + 1;
                    end = start + 1;
                }
                if (num[mid]>target){
                    end=mid-1;
                }
            }
        return -1;
    }

    public static void main(String[] args) {
        int []nums = {2,3,3,3,4,5,5,6,6,8,9,10,10,11,12,22,};
        int index=(binarySearchInfinityArray(nums,7));
        System.out.println(index);
    }
}
