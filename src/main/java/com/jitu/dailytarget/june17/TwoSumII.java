package com.jitu.dailytarget.june17;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int end = numbers.length - 1;
        while (s < end) {
            int total = numbers[s] + numbers[end];
            if (total == target) {
                return new int[]{s, end};
            }
            if (total > target) {
                end--;
            }
            if (total < target) {
                s++;
            }
        }
        return new int[]{-1, -1};
    }




    // [3,2,4]  a = 0; end 2 target =6   3+ 4 = 7
    // end = 
}
