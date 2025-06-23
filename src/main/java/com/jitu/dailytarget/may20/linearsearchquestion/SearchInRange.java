package com.jitu.dailytarget.may20.linearsearchquestion;

public class SearchInRange {
    public static int searchInRange(int arr[], int target, int indexfrom, int indexto) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = indexfrom; i <= indexto; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={3,4,6,7,2,};
        System.out.println(searchInRange(arr,2,2,4));
    }
}
