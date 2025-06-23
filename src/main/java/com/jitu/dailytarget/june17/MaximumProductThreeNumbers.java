package com.jitu.dailytarget.june17;

import java.util.Arrays;

public class MaximumProductThreeNumbers {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        long sum = 1;
        for (int j = 0; j < nums.length; j++) {
            sum = sum * nums[j];
        }
        return (int) sum;
    }
}
