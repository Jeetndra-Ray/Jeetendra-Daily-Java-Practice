package com.jitu.dailytarget.june5;

/*
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
Given the array nums, for each nums[i] find out how
many numbers in the array are smaller than it. That is, for
each nums[i] you have to count the number of valid j's
such that j != i and nums[j] < nums[i].*/

public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []result = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            int count = 0;
            for(int j = 0;j<nums.length;j++){
                if (j != i&&nums[j] < nums[i])
                    count++;
            }
            result[i]=count;
        }
        return result;
    }
}
