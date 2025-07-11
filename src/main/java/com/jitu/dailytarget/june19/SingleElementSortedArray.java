package com.jitu.dailytarget.june19;
//  https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class SingleElementSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while (start<end){
            int mid = (start+end)/2;
           if (mid % 2==1){
               mid--;
           }
           if (nums[mid]!=nums[mid+1]){
               end=mid;
           }
           else start=mid+2;
        }
        return nums[start];
        // 1,1,2,3,3,4,4,8,8
    }
    public int singleNonDuplicate1(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 2;
            }
        }
        return nums[start];
    }

}
