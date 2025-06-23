package com.jitu.dailytarget.may22;

//Input: nums = [1,3,5,6], target = 7
//Output: 4

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (target>nums[i] || target-nums[i]==1 ){
                count=i+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {-1,3,5,6};
        System.out.println( searchInsert(nums,0));
    }
}
