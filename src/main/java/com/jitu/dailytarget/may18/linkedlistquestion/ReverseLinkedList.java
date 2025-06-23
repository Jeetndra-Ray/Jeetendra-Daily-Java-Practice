package com.jitu.dailytarget.may18.linkedlistquestion;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.addFirst(1);

        for (int i =num.size()-1;i>=0;i--){
            System.out.print(num.get(i)+"-->");
        }
    }
}
