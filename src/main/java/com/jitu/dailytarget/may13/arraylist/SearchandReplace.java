package com.jitu.dailytarget.may13.arraylist;

import java.util.ArrayList;

// Create an ArrayList<String> of 5 fruit names.
//Take input from the user: fruit to replace and new fruit name.

public class SearchandReplace {
    public static void main(String[] args) {
        String fruittoreplace = "Kiwi";
        String newfruitname = "PineApple";
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        System.out.println("-------------------before Replace--------------------");
        for (String s : fruit) {
            System.out.println(s);
        }
        if (fruit.contains(fruittoreplace)) {
            fruit.set(fruit.indexOf(fruittoreplace), newfruitname);
        } else System.out.println("Fruit Not Found");
        System.out.println("-------------------before Replace--------------------");
        for (String s : fruit) {
            System.out.println(s);
        }
    }
}
