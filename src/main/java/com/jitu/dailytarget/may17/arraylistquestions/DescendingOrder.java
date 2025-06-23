package com.jitu.dailytarget.may17.arraylistquestions;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Jitu");
        name.add("Sonu");
        name.add("Annu");
        name.add("Susu");
        name.add("Moon");
        name.add("Lali");
        Collections.sort(name,Collections.reverseOrder());

        for (String s:name){
            System.out.println(s);
        }
    }

}
