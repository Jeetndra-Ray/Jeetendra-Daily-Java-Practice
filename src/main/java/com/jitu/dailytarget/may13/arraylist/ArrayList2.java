package com.jitu.dailytarget.may13.arraylist;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(10);
        number.add(15);
        number.add(20);
        number.add(0,0);
        //number.add(8,40); we can not add 40 at index 8 because the size of the list is 5 only till now

        for (int i :number){
            System.out.println(i);
        }
        System.out.println("_________________________________________");
        number.remove(3);
        //number.remove(15);
        for (int i :number){
            System.out.println(i);
        }
    }
}
