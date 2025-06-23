package com.jitu.dailytarget.may30.arrays;

public class ArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
       int ans[]=new int[nums.length];
       for (int i=0;i<nums.length;i++){
           ans[i] = nums[nums[i]];
       }
       return ans;
    }

    public static void main(String[] args) {
        int[]arr={0,2,1,5,3,4};
        int []arr1=buildArray(arr);
        for (int i :arr1){
            System.out.println(i);
        }
    }
}
