package com.jitu.dailytarget.april25.arrays;

// 18) Merge two arrays into a third.

public class MergeArray {
    public static void main(String[] args) {

        int a[]={2,3,4};
        int b[]={5,6,7};
        int length= a.length + b.length;
        int c[] = new int[length];
        for (int i=0;i<a.length;i++){
            c[i] = a[i];
         ///   c[i+1] =b[i]; wording approach
            c[a.length + i] = b[i];
        }
        for (int i : c){
            System.out.print(i+",");
        }
    }
}
