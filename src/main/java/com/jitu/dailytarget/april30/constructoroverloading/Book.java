package com.jitu.dailytarget.april30.constructoroverloading;

// Write a class Book with overloaded constructors: one that sets title & author, and another
// that sets title, author, and price. Display all fields.

public class Book {
    String title;
    String author;
    float price;

    public Book(String title, String author){
        this.author=author;
        this.title=title;
    }
    public Book(String title, String author, float price){
        this.author=author;
        this.title=title;
        this.price=price;
    }

    public void display(){
        System.out.println("Title of the Book is: "+ title);
        System.out.println("Author of the Book is: "+ author);
        System.out.println("Price of the Book is: "+ price+" Rupees" );
    }

}
