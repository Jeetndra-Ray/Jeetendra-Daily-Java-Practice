package com.jitu.dailytarget.may18.linkedlistquestion;

// Create a LinkedList<String> for a task list. Add tasks at beginning and end, then display.

import java.util.LinkedList;

public class LinkedListTasks {

    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Make Food");
        tasks.add("Read Book");
        tasks.addLast("Go to Sleep");
        tasks.addFirst("10 Questions of LinkList");
       // Insert a new task at a specific index in a LinkedList<String>.
        tasks.add(2,"Eat Food");
        for (String s : tasks){
            System.out.println(s);
        }
    }

}
