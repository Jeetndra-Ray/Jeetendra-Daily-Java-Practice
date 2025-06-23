package com.jitu.dailytarget.may12.librarysystem;

import java.util.ArrayList;

public class LibrarySystem {
  private ArrayList<String> book = new ArrayList<>();

    public void addBook(String bookName) {
        book.add(bookName);
        System.out.println(bookName + " : has been added.");
    }

    public void deleteBook(String bookName) {
        if (book.remove(bookName)) {
            System.out.println(bookName + " : has been removed.");
        } else System.out.println(bookName + " : not found.");
    }

    public void search(String bookName){
        if (book.contains(bookName)){
            System.out.println(bookName+" : is avaliable");
        }
        else System.out.println(bookName + " : is not avaliable");
    }

    public void displayBooks() {
        if (book.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            System.out.println("Books in library:");
            for (String book : book) {
                System.out.println("- " + book);
            }
        }
    }
}
