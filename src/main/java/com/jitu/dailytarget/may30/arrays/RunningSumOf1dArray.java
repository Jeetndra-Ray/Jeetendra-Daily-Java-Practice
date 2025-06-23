package com.jitu.dailytarget.may30.arrays;

public class RunningSumOf1dArray {
    public static int [] runningSum(int []nums){
        int []ans=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            for (int j=0;j<i;j++){
                ans[i]=ans[i]+nums[j];
            }

        }
        return ans;
    }

    public static int [] runningSumOthersApproch(int []nums){
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }


    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int []ans=runningSum(nums);
        for (int i : ans){
            System.out.println(i);
        }
    }
}
