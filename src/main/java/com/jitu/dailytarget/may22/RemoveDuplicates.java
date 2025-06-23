package com.jitu.dailytarget.may22;

/*
       Input: nums = [1,1,2]
        Output: 2, nums = [1,2,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
        It does not matter what you leave beyond the returned k (hence they are underscores).
*/

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int index=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arry[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arry));
    }

}
