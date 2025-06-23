package com.jitu.dailytarget.may28;

public class GreatestCommonDivisorOfArray {
    public static int findGCD(int[] nums) {

     int small=nums[0];
     int large=nums[0];
     for (int i=0;i<nums.length;i++){
         if (nums[i]<small){
             small=nums[i];
         }
         if (nums[i]>large){
             large=nums[i];
         }
     }
        while (large != 0) {
            int temp = large;
            large = small % large;
            small = temp;
        }
       return small;
    }

    public static void main(String[] args) {
        int []arr={3,5,8,6};
        System.out.println(findGCD(arr));
    }
}
