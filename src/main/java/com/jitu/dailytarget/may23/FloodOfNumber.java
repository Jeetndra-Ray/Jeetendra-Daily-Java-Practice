package com.jitu.dailytarget.may23;

public class FloodOfNumber {
    public static int findOfNumber(int arr[],int target){
        int star=0;
        int end= arr.length-1;
        while (star<=end){
            int mid=(star+end)/2;
            if (mid==target){
                return arr[mid];
            }
            if (arr[mid]<target){
                star=mid+1;
            }else end=mid-1;
        }
        return arr[end];
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(findOfNumber(arr, 4));
    }
}
