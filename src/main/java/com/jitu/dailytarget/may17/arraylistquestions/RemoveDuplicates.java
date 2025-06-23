package com.jitu.dailytarget.may17.arraylistquestions;

import java.util.ArrayList;


public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Jitu");
        name.add("Sonu");
        name.add("Annu");
        name.add("Susu");
        name.add("Moon");
        name.add("Lali");
        name.add("Jitu");
        name.add("Annu");
        name.add("Annu");
        name.add("Susu");
        name.add("Susu");

        for (int i = 0;i<name.size();i++){
             for (int j = i+1;j<name.size();j++){
                 if (name.get(i).equals(name.get(j))){
                     name.remove(j);
                     j--;
                 }
             }
        }

        for (String s:name){
            System.out.println(s);
        }

    }
}
