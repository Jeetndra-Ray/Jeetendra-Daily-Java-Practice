package com.jitu.dailytarget.june17;

import java.util.Arrays;
//https://leetcode.com/problems/majority-element/description/?envType=problem-list-v2&envId=sorting
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    temp++;
                }
            }
            if (temp > count) {
                count = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    temp++;
                }
            }
            if (temp == count) {
                return nums[i];
            }
        }
        return -1;
    }
}
