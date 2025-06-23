package com.jitu.dailytarget.may13.arraylist;

//Create an ArrayList<String> of 5 city names.
//Print them in reverse order (without modifying the list).

import java.util.ArrayList;

public class ReversePrint {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");

        for (int i = fruit.size()-1;i>=0;i--){
            System.out.print(fruit.get(i)+" ,");
        }
    }
}
