package com.tw.Biblioteca;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kvivek on 13/01/15.
 */
public class Library{  //keeps collection of books and it availability
    List<Book> books;
    public boolean displayBooksInLibrary;

    Library(Book... books)
    {
        this.books = Arrays.asList(books);
    }


}
