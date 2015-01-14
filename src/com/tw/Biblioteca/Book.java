package com.tw.Biblioteca;

/**
 * Created by kvivek on 13/01/15.
 */
public class Book{
    String available;  //keeps book with its parameter  in Library
    String bookName;
    String author;
    String publishedOn;

    public Book(String bookName, String author, String publishedOn) {  //takes parameter for new books
        this.bookName=bookName;
        this.author=author;
        this.publishedOn=publishedOn;
        this.available="available";
    }
}
