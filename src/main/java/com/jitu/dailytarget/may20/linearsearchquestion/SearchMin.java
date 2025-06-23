package com.jitu.dailytarget.may20.linearsearchquestion;

public class SearchMin {
    public static int searchMin(int arr[]){
        int min =arr[0];
        if (arr.length==0){
            return -1;
        }
        for (int i = 0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[]={3,4,6,7,2,};
        System.out.println(searchMin(arr));
    }
}
