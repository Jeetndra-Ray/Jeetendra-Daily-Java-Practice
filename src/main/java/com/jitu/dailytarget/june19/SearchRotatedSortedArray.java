package com.jitu.dailytarget.june19;

import java.util.Arrays;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        int start =0, end =nums.length-1;
        while (start < end){
            int mid = (start+end)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]>target&&nums[mid]<nums[mid-1]){
                start=mid;
            }
            else end=mid-1;
        }
        return -1;
    }
    // 4,5,6,7,0,1,2  s = 0 e = 6 m = 3 nums[m]=7
    //
}
