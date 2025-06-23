package com.jitu.dailytarget.april30.constructoroverloading;

//Write a class Book with overloaded constructors: one that sets title & author,
// and another that sets title, author, and price. Display all fields.

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Wings Of Fire An Autobiography","Arun Tiwari");
        book.display();
        Book book1 = new Book("Wings Of Fire An Autobiography","Arun Tiwari",345);
        book1.display();
    }
}
