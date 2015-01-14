package com.tw.Biblioteca;

/**
 * Created by kvivek on 14/01/15.
 */
public class Return extends MenuItems {  //gives interface for customer to return books



    public void returnBook(String option,Library library){  ////provides interface to customer with specific library name
        System.out.println(new Librarian().returnBook(option, library));
    }
}
