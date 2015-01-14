package com.tw.Biblioteca;

import java.util.Scanner;

/**
 * Created by kvivek on 13/01/15.
 */
public class ConsoleInterface implements UserInterface {  //prints all messages required before any inplementation

    Book books[] = new Book[]{new Book("Head first java", "O'Reilly", "2010"), new Book("Let us C", "Yaswant Kanetker", "2007"), new Book("Complete reference to C++", "Herb Schildt", "2006"), new Book("Ruby on Rails", "David Heinemeier Hansson", "2004"), new Book("Agile development", "Ken Schwaber", "2009")};
    Library library = new Library(books);

    public ConsoleInterface() {
    }

    @Override
    public void showWelcomeMessage() {
        System.out.println("Welcome");
    }  //shows wellcome message told by biblioteca

    @Override
    public void showMainMenuItems() {     //shows all the options that can be selected
        System.out.println("BookList");
        System.out.println("Checkout");
        System.out.println("ReturnBooks");
        System.out.println("Quit");
    }


    public void menuItemSelected(String option) {  //maps the selected option with given option
        MainMenu menu = new MainMenu();
        MenuItems items;
        items = menu.get(option);
        if (items.getClass().equals((new Checkout()).getClass())) {
            String bookName = getBookName();
            new Checkout().checkOut(bookName, library);
        } else if (items.getClass().equals((new Return()).getClass())) {
            String bookName = getBookName();
            new Return().returnBook(bookName, library);
        } else if (items.getClass().equals((new ListOfBooks()).getClass())) {
            new ListOfBooks().displayBookList(library);
        } else if (items.getClass().equals((new Quit()).getClass())) {
            new Quit().quit();
        } else {
            System.out.println("Select a valid option!");
        }

    }

    private String getBookName() {
        System.out.println("enter book name to be checkout");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
