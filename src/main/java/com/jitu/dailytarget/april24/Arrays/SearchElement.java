package com.jitu.dailytarget.april24.Arrays;
// 13) Search for an element in an array.

public class SearchElement {
    public static void main(String[] args) {

        int a [] = {3,4,5,8,5,7};
        int search_element = 7;
        for ( int i = 0;i<a.length; i++){
            if (a[i]==search_element){
                System.out.println(i);
            }
        }
    }
}
