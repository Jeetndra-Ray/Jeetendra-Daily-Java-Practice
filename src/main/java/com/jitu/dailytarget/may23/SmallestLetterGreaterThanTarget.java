package com.jitu.dailytarget.may23;

/*744.Find Smallest Letter Greater Than Target
        You are given an array of characters letters that is sorted in non-decreasing order,and a character target.There are at least two different characters in letters.
        Return the smallest character in letters that is lexicographically greater than target.If such a character does not exist,return the first character in letters.
        Example 1:
        Input:letters=["c","f","j"],target="a"
        Output:"c"
        Explanation:The smallest character that is lexicographically greater than'a'in letters is'c'.*/

public class SmallestLetterGreaterThanTarget {
    public static char smallestLetterGreaterThanTarget(char[] letters, char target){
        int star=0;
        int end=letters.length-1;
        while (star<end){
           int mid=(star+end)/2;
            if (letters[mid] < target) {
                end = mid - 1;
            } else star = mid + 1;
        }

        return letters[star%letters.length];
    }

    public static void main(String[] args) {
        char[] charArray = {'c', 'f', 'j'};
        System.out.println(smallestLetterGreaterThanTarget(charArray,'d'));
       // int [] arr={5,6,7,8,4,7,9};
        //System.out.println(smallestNumberGreaterThanTarget(arr,4));
    }


    public static int smallestNumberGreaterThanTarget(int[] letters, int target){
        int star=0;
        int end=letters.length-1;
        while (star<end){
            int mid=(star+end)/2;
            if (letters[mid] < target) {
                end = mid - 1;
            } else star = mid + 1;
        }

        return letters[star%letters.length];
    }

}
