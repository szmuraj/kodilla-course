package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Wawa");
        library.books.add(new Book("Book1", "Author1", LocalDate.of(2011, 12,5)));
        library.books.add(new Book("Book2", "Author2", LocalDate.of(2012, 12,5)));
        library.books.add(new Book("Book3", "Author3", LocalDate.of(2013, 12,5)));
        library.books.add(new Book("Book4", "Author4", LocalDate.of(2014, 12,5)));
        library.books.add(new Book("Book5", "Author5",  LocalDate.of(2015, 12,5)));

        //When

        //Then
        //Assertions.assertEquals("Author1", library.books.stream().flatMap(book -> book.getAuthor()).toString());
    }
}
