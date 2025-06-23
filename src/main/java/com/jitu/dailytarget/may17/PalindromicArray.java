package com.jitu.dailytarget.may17;

public class PalindromicArray {

    private static void isPalindromic(int array[]) {
        int start = 0;
        int end = array.length - 1;
        boolean isPalindromic = true;
        while (start < end) {
            if (array[start] != array[end]) {
                isPalindromic = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindromic) {
            System.out.println("The array is palindromic.");
        } else {
            System.out.println("The array is NOT palindromic.");
        }
    }
    public static void main(String[] args) {
        int array[] = {2, 3, 4, 3, 2};
        int array1[]={2,3,4,5,2};
         isPalindromic(array);
         isPalindromic(array1);
    }
}
