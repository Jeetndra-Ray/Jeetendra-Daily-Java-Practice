package com.jitu.dailytarget.may17;

public class MergeArray {

    public static void mergeArray(int a[],int b[]){

    }
    public static void main(String[] args) {

        int array[] = {1,2,3,4,5};
        int array1[]={6,7,8,9,10};
        int index=array1.length+array.length;
        int array3[]=new int [index];

        for (int i = 0;i<array.length;i++){
            array3[i]=array[i];
            array3[array.length+i]=array1[i];
        }
        for (int i : array3){
            System.out.print(i+",");
        }
    }
}
