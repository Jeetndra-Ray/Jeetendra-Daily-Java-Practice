package com.jitu.dailytarget.april25.arrays;

// 17) Copy one array to another.
public class CopyArray {
    public static void main(String[] args) {
        int a [] ={2,34,5,7};
        int b[] = new int [a.length];

        System.out.println("Before Copying");
        for (int e: b){
            System.out.print(e+", ");
        }
        System.out.println("");

        for (int i=0;i<a.length;i++){
            b[i]= a[i];
        }

        System.out.println("After Copying");

        for (int e: b){
            System.out.print(e+", ");
        }



    }
}
