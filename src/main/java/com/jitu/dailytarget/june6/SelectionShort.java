package com.jitu.dailytarget.june6;

import java.util.Arrays;

public class SelectionShort {
    // select the larget element and swap it to the last index

    public static int[] selectionShortFromMin(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min_idx])
                    min_idx = j;
                int temp = nums[min_idx];
                nums[min_idx] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }

    public static int[] selectionShortFromMax(int []nums){
        for (int i = 0;i<nums.length;i++){
            int maxIndex = nums.length-1-i;
            int max = 0;
            for (int j = 0;j<=maxIndex;j++){
                if (nums[j]>nums[max]){
                    max=j;
                }
            }
            if (max!=maxIndex){
                int temp = nums[max];
                nums[max]=nums[maxIndex];
                nums[maxIndex]=temp;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int []arry ={55,77,885,24,55,5,6,12,45,7543,35,64};
        int []arry2 ={55,77,885,24,55,5,6,12,45,7543,35,64};
        selectionShortFromMax(arry);
        selectionShortFromMin(arry2);
        System.out.println(Arrays.toString(arry)+" :selectionShortFromMax");
        System.out.println(Arrays.toString(arry2));
    }
    ///
}
