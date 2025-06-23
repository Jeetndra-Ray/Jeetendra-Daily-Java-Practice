package com.jitu.dailytarget.june6;

//https://leetcode.com/problems/largest-number/description/?envType=problem-list-v2&envId=sorting
public class LargestNumber {
    public static String largestNumber(int[] nums) {
        String s = "";
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            s = s + nums[i];
        }
        return s;
    }


    public static void main(String[] args) {
        int nusm[] = {3,30,34,5,9};
        System.out.println(largestNumber(nusm));
    }

}
