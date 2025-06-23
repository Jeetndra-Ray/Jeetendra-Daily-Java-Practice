package com.jitu.dailytarget.may20;

public class LinearSearchMethod {
    public static int linearSearchMethod(int arr[], int target){

        if (arr.length==0){
            return -1;
        }
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,5,6,8,9};
        System.out.println( linearSearchMethod(arr,45));
    }
}
