package com.jitu.dailytarget.june5;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n){

        for (int i = 0,j=m;i<nums1.length-m;i++){
            nums1[j]=nums2[i];
        }
        Arrays.sort(nums1);
        for (int i :nums1){
            System.out.print(i+",");
        }
    }

    public static void main(String[] args) {
        int []nums1={};
        int []nums2={1};
        merge(nums1,0,nums2,1);
    }
}
