package com.tw.Biblioteca;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LibraryTest {
    Book books[] = new Book[]{new Book("Head first java", "O'Reilly", "2010"), new Book("Let us C", "Yaswant Kanetker", "2007"), new Book("Complete reference to C++", "Herb Schildt", "2006"), new Book("Ruby on Rails", "David Heinemeier Hansson", "2004"), new Book("Agile development", "Ken Schwaber", "2009")};
    Library library=new Library(books);

    @Test
    public void testDisplayBooksInLibrary() throws Exception {
        LibraryCatalog catalog=new LibraryCatalog(books);
        catalog.displayBooksInLibrary(library);
        assertThat(catalog.displayBooksInLibrary, is(true));
    }

    @Test
    public void testAvailabilityOfBook(){
    LibraryCatalog catalog=new LibraryCatalog();
        assertThat(catalog.availability("Head first java",library), is("available"));

    }

    @Test
    public void testIfBookIsNotAvailable(){
        LibraryCatalog catalog=new LibraryCatalog(books);
        assertThat(catalog.availability("Pearl",library), is("That book is not available."));

    }

   @Test
    public void testForSuccessFulCheckout(){
        LibraryCatalog catalog=new LibraryCatalog();
        assertThat(catalog.tryToCheckOut("Head first java", library), is("Thank you! Enjoy the book"));
    }

    @Test
    public void testForUnSuccessFulCheckout(){
        LibraryCatalog catalog=new LibraryCatalog();
        assertThat(catalog.tryToCheckOut("Pearl",library), is("That book is not available."));
    }

    @Test
    public void testForUnsuccessFulReturn(){
        Librarian librarian=new Librarian();
        assertThat(librarian.returnBook("Pearl",library),is("That is not a valid book to Return."));
    }

    @Test
    public void testForSuccessFulReturn(){
        Librarian librarian=new Librarian();
        library.books.get(1).available="unavailable";
        assertThat(librarian.returnBook("Head first java",library),is("That is not a valid book to Return."));
    }
}