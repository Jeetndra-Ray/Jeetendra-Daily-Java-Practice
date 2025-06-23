package com.jitu.dailytarget.may12.librarysystem;

public class LibrarySystemTest {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.addBook("Don Quixote: by Miguel de Cervantes");
        librarySystem.addBook("Pride and Prejudice: by Jane Austen");
        librarySystem.addBook("Alice's Adventures in Wonderland: by Lewis Carroll");
        librarySystem.addBook("The Adventures of Huckleberry Finn: by Mark Twain");
        librarySystem.addBook("The Adventures of Tom Sawyer: by Mark Twain");
        librarySystem.addBook("Treasure Island: by Robert Louis Stevenson");
        librarySystem.addBook("1984: by George Orwell");
        librarySystem.addBook("The Great Gatsby: by F. Scott Fitzgerald");
        librarySystem.addBook("The Catcher in the Rye: by J.D. Salinger");
        librarySystem.addBook("Harry Potter Series: by J.K. Rowling");
        librarySystem.addBook("The Lord of the Rings Trilogy: by J.R.R. Tolkien");
        librarySystem.addBook("Atomic Habits: by James Clear");
        librarySystem.addBook("The Psychology of Money: by Morgan Housel");

     //   librarySystem.deleteBook("Don Quixote: by Miguel de Cervantes");
        librarySystem.displayBooks();

    }
}
