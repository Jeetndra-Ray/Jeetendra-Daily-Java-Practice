package com.jitu.dailytarget.may23;

import java.util.ArrayList;
import java.util.List;

//Given a 0-indexed integer array nums of length n and an integer target,
// return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.

public class CountPairs {
    public static int countPairs(List<Integer> nums, int target) {
        int start=0;
        int end=nums.size()-1;
        int count=0;
        while (start<=end){
            if ( start<end || nums.get(start) + nums.get(end) < target ){
                count++;
            }
            start++;
            end--;
        }
        return count;
    }

    public static void main(String[] args) {
          //int [] arr={-1,1,2,3,1};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        System.out.println(countPairs(arr,2));
    }
}
