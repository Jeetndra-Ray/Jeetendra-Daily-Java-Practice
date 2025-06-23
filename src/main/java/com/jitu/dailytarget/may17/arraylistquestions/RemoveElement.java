package com.jitu.dailytarget.may17.arraylistquestions;

// Remove all elements that start with a specific letter from an ArrayList<String>.

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Jitu");
        name.add("Sonu");
        name.add("Annu");
        name.add("Susu");
        name.add("Moon");
        name.add("Lali");
        for (int i= 0;i<name.size();i++){
            if (name.get(i).contains("S")){
                name.remove(i);
            }
        }
        for (String s:name){
            System.out.println(s);
        }
    }
}
