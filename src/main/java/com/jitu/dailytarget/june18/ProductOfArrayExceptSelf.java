package com.jitu.dailytarget.june18;
// https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int []ans = new int[nums.length];
        for (int i = 0;i<=nums.length;i++){
            int sum = 1;
            for (int j =0;j<nums.length;j++){
                if (j!=i){
                    sum= sum*nums[j];
                }
            }
            ans[i]=sum;
        }
        return ans;
    }

}
