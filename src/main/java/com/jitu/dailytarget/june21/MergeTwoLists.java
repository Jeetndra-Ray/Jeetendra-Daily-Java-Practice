package com.jitu.dailytarget.june21;

import com.jitu.dailytarget.june18.ListNode;

import java.util.LinkedList;

public class MergeTwoLists {
    public LinkedList<Integer > mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        int x;
        if (list1.size()<list2.size()){
            x=list1.size();        }
        else x=list2.size();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i =0;i<x;i++){
            if (list1.get(i)>list2.get(i)){
                linkedList.add(list2.get(i));
            }
            if (list1.get(i)<list2.get(i)){
                linkedList.add(list1.get(i));
            }
            if (list1.get(i)==list2.get(i)){
                linkedList.add(list1.get(i));
            }
        }
        return linkedList;
    }
}
