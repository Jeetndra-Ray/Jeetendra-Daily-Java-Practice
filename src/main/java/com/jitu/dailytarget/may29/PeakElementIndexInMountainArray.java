package com.jitu.dailytarget.may29;

public class PeakElementIndexInMountainArray {

    public static int peakElementIndexInMountainArrayUsingLinearSearch(int []arr){
        int peakElementIndex=0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>peakElementIndex){
                peakElementIndex=arr[i];
            }
        }
        return peakElementIndex;
    }

    public static int peakElementIndexInMountainArrayUsingBinarySearch(int []arr){
        int peakElementIndex=0;
        int star = 0;
        int end=arr.length-1;
        while (star == end){
            int mid = (star+end)/2;
            if (peakElementIndex<arr[mid]){
                peakElementIndex=mid;
            }
            if (arr[mid]<arr[mid+1]){
                star=mid+1;
            }
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }
        }
        return peakElementIndex;
    }

    public static void main(String[] args) {
        int []arr={0,1,0};
       // System.out.println(peakElementIndexInMountainArrayUsingLinearSearch(arr));
        System.out.println(peakElementIndexInMountainArrayUsingBinarySearch(arr));
    }


    // m=1, arr[mid]=4;,start = 0,end=3
    // if (start>mid){
         // peak == start;
    // }
   //   if(end > mid){
    //   peak == end}
    // else {
    //     peak = mid
    // }
    // star = mit+1;
}
