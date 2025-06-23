package com.jitu.dailytarget.may23;

/* Single Element in a Sorted Array
Input: nums = [1,1,2,3,3,4,4,8,8]
        Output: 2*/
public class SingleElementinaSortedArray {
    public static int singleElementSortedArray(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return nums[0];
    }
    public static int singleElementSortedArrayApprochTwo(int nums[]){
        int f=0;
        int l=nums.length-1;
        while (f<=l){

        }

        return nums[0];
    }

    public static void main(String[] args) {
        int arr[] = {2,3, 3, 7, 7, 10,10, 11, 11};
        System.out.println(singleElementSortedArray(arr));
    }
}
