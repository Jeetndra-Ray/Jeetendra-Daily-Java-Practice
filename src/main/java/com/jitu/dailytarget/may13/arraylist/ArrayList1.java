package com.jitu.dailytarget.may13.arraylist;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Jitu");
        name.add("Susu");
        name.add("Moon");
        name.add("Sonu");

        for (int i = 0;i<name.size();i++){
            System.out.print(name.get(i)+", ");
        }
        System.out.println();

        for (String i :name){
            System.out.println(i);
        }

    }
}
