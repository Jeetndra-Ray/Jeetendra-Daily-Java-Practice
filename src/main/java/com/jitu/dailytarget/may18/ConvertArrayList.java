package com.jitu.dailytarget.may18;

//Convert an array (e.g., int[]) to an ArrayList<Integer>.

import java.util.ArrayList;

public class ConvertArrayList {
    public static void main(String[] args) {
        int array[]={3,4,5,7,4};
        ArrayList<Integer> num = new ArrayList<>();

        for (int i=0;i<array.length;i++){
            num.add(array[i]);
        }
        for (int i : num){
            System.out.print(i+",");
        }
    }
}
