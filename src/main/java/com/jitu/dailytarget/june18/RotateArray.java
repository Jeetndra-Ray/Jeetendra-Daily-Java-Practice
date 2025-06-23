package com.jitu.dailytarget.june18;
// https://leetcode.com/problems/rotate-array/description/
import java.util.ArrayList;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
       int []ans = new int[nums.length];
       int index=0;
       int len = nums.length-1;
       for (int i =1;i<=k;i++){
           ans[index]= nums[len];
           index++;
           len--;
        }
/*       for (int i = k+1;i<nums.length;i++){
           ans[index]= nums[i];
           index++;
       }*/
       for (int i =0; i<=nums.length-k-1;i++){
           ans[index]= nums[i];
           index++;
       }
        System.arraycopy(ans, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int nums[]={-1,-100,3,99};
        int k =2;
        rotate(nums,k);
        for (int i : nums){
            System.out.print(i+",");
        }
    }
}

