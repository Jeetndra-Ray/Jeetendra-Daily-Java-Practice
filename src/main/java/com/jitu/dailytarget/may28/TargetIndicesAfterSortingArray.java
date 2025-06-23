package com.jitu.dailytarget.may28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TargetIndicesAfterSortingArray {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> arrayList = new ArrayList<>();
        Arrays.sort(nums);
        int start = 0;
        int end=nums.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (nums[mid]==target){
                if (!arrayList.contains(mid)){
                    arrayList.add(mid);
                }
                end=mid-1;
            }
            if (target>nums[mid]){
                start=mid+1;
            }
            if (target<nums[mid]){
                end=mid-1;
            }
        }

        int start1 = 0;
        int end1=nums.length-1;
        while (start1<=end1){
            int mid = (start1+end1)/2;
            if (nums[mid]==target){
                if (!arrayList.contains(mid)){
                    arrayList.add(mid);
                }
                start1=mid+1;
            }
            if (target>nums[mid]){
                start1=mid+1;
            }
            if (target<nums[mid]){
                end1=mid-1;
            }
        }
//        if (arrayList.get(0)>arrayList.get(1)){
//            int temp = arrayList.get(0);
//           arrayList.set(0,arrayList.get(1));
//           arrayList.set(1,temp);
//        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void main(String[] args) {
        int []nums={75,99,19,93,87,68,12,18,48,83,24,50,16,53,36,16,80,68,46,13,53,100,50,49,77,
                52,34,42,38,98,73,11,13,61,72,8,11,67,98,24,23,71,47,6,5,7,97,86,25,82,11,15,26,
                97,69,6,30,77,98,44,32,39,71,47,64,78,6,61,72,75};
        System.out.println(nums.length);
        Arrays.sort(nums);
        for (int i: nums){
            System.out.print(i+",");
        }
        System.out.println();

       List<Integer> result= targetIndices(nums,98);
       for (int i : result){
           System.out.println(i);
       }
    }
}
