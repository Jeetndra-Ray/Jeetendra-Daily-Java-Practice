package com.jitu.dailytarget.may30.arrays;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
          int []ans=new int[nums.length*2];
          for (int i=0;i<nums.length;i++){
              ans[i]=nums[i];
              ans[nums.length+i]=nums[i];
          }
          return ans;
    }
}
