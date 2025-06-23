package com.jitu.dailytarget.may13.arraylist;

// Write a method to remove all occurrences of 20 from the list.

import java.util.ArrayList;

public class RemoveOccurrences {
    public static void main(String[] args) {
        int removeOccurrence=20;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(20);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(20);
        System.out.println("list before removing Occurrence of 20 ");
        for (int i :arrayList){
            System.out.print(i+",");
        }
        System.out.println("");
        System.out.println("list after removing Occurrence of 20 ");
        for (int i= 0;i<arrayList.size();i++){
            if (arrayList.get(i) ==removeOccurrence){
              arrayList.remove(i);
            }
        }
        for (int i :arrayList){
            System.out.print(i+",");
        }

    }
}
