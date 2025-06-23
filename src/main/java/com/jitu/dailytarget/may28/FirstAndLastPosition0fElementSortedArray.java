package com.jitu.dailytarget.may28;

public class FirstAndLastPosition0fElementSortedArray {
    public static int[] searchRange(int[] nums, int target){
        int []index={-1,-1};
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (nums[mid]==target) {
                index[0]=mid;
                end=mid-1;
            }
            if (nums[mid]>target){
                end=mid-1;
            }
            if (nums[mid]<target){
                start=mid+1;
            }
        }

        int start1=0;
        int end1=nums.length-1;
        while (start1<=end1){
            int mid = (start1+end1)/2;
            if (nums[mid]==target){
                index[1]=mid;
                start1=mid+1;
            }
            if (nums[mid]>target){
                end1=mid-1;
            }
            if (nums[mid]<target){
                start1=mid+1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int []nums={5,7,8,8,8,10};
        int []index=searchRange(nums,8);
       for (int i:index){
           System.out.println(i);
       }
    }
}
