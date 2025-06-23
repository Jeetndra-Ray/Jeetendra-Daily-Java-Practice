package com.jitu.dailytarget.june18;
//https://leetcode.com/problems/merge-two-sorted-lists/


public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        int a=list1.val;
        int b = list2.val;
        if (a<b){
            list3.val=a;
        }

        return list3;
    }
}
