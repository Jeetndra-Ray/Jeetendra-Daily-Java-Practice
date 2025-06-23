package com.jitu.dailytarget.june5;

public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    sum = sum * nums[j];
                }
            }
            answer[i] = sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
       int[] sum = productExceptSelf(nums);
        for (int i : sum) {
            System.out.print(i + ",");
        }
    }
}
