package com.jitu.dailytarget.june2;

/*Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].*/

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i<n;i++) {
            result[i+i] = nums[i];
//           result[i+1]=nums[n+i];
        }
        int num = n;
        for (int i = 1; i <= n;i++ ) {
            result[i+i-1] = nums[num];
            num++;
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums={2,5,1,3,4,7};
        for (int i : shuffle(nums,3)){
            System.out.println(i);
        }
    }
}
