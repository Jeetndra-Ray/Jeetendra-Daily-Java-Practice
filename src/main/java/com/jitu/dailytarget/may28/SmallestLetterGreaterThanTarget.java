package com.jitu.dailytarget.may28;

public class SmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int star=0;
        int end=letters.length-1;
        while (star<=end){
            int mid = star +(end-star)/2;
            if (target<letters[mid]) {
                end = mid - 1;
            } else star = mid + 1;
        }

        return letters[star%letters.length];
    }

    public static void main(String[] args) {
        int s=2%3;
        System.out.println(s);
    }


}
