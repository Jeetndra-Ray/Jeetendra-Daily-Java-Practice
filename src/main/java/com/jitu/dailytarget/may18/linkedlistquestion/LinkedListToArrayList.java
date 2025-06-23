package com.jitu.dailytarget.may18.linkedlistquestion;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.addFirst(1);
        num.add(8);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
            arrayList.add(num.get(i));

        }
        for (int i : arrayList){
            System.out.print(i+",");
        }
    }
}
