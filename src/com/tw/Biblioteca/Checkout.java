package com.tw.Biblioteca;

/**
 * Created by kvivek on 14/01/15.
 */
public class Checkout extends MenuItems {    //gives interface to customer to checkout

    public void checkOut(String bookName,Library library) {
        new Librarian().checkout(bookName,library);
    }
}
