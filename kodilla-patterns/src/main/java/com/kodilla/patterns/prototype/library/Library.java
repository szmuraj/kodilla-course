package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library>{

    String name;
    Set<Book> books = new HashSet<>();

    public Library( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book : books) {
            Library clonedBooks = new Library(book.getTitle());
            for (Book author : books) {
                clonedBooks.getBooks().add(author);
            }
        }
        return clonedLibrary;
    }
}