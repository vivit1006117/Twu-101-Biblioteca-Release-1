package com.tw.Biblioteca;

/**
 * Created by kvivek on 14/01/15.
 */
public class Librarian {  //it is the user who maps books name to given libraries

    public void checkout(String bookname, Library books) {  //maps books to libraries for customer to take books
        LibraryCatalog catalog=new LibraryCatalog();
        System.out.println(catalog.tryToCheckOut(bookname, books));
    }

    public String returnBook(String bookName, Library books) {  //maps books to libraries for customer to return books
        LibraryCatalog catalog=new LibraryCatalog();
        return catalog.returnbook(bookName,books);
    }
}
