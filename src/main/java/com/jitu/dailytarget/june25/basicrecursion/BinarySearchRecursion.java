package com.jitu.dailytarget.june25.basicrecursion;

public class BinarySearchRecursion {
    public static int binarySearchRecursion(int[] nums, int target, int start, int end) {
        if (start>end){
            return -1;
        }
        int temp = (start+end)/2;
        if (nums[temp]==target){
            return temp;
        }
        if (nums[temp]<target){
            return binarySearchRecursion(nums,target,temp+1,end);
        }
        else return binarySearchRecursion(nums,target,start,temp-1);
    }

    public static void main(String[] args) {
        int []nums = {-1,0,3,5,9,12};
        int target=0;
        int ans = binarySearchRecursion(nums,target,0,nums.length-1);
        System.out.println(ans);
    }
}
