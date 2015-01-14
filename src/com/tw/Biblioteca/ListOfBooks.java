package com.tw.Biblioteca;

import java.awt.*;

/**
 * Created by kvivek on 14/01/15.
 */
public class ListOfBooks extends MenuItems{  //Displays all available books in Library


    public void displayBookList(Library library) {   //It displays available books in Specific Library
        LibraryCatalog libraryName = new LibraryCatalog();
        libraryName.displayBooksInLibrary(library);
    }


}
