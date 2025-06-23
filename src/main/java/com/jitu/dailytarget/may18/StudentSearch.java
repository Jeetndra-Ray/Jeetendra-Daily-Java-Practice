package com.jitu.dailytarget.may18;

import java.util.ArrayList;


// Take 10 student names, store in an ArrayList, and search a name entered by the user.

public class StudentSearch {
    private ArrayList<String> student = new ArrayList<>();

    public void addStudent(String studentName){
        student.add(studentName);
    }
    public void searchStudent(String studentName){
        if (student.contains(studentName)){
            System.out.println(student.get(student.indexOf(studentName)));
        }
        else System.out.println(studentName + " : not found.");
    }

    public static void main(String[] args) {
        StudentSearch studentSearch = new StudentSearch();
        studentSearch.addStudent("Jitu");
        studentSearch.addStudent("Sonu");
        studentSearch.addStudent("Susu");
        studentSearch.searchStudent("monu");
    }
}
