package com.tw.Biblioteca;

/**
 * Created by kvivek on 14/01/15.
 */
public class LibraryCatalog extends Library {  //works on specific library and works on the collection of it like: valitating etc
    public LibraryCatalog(Book[] books) {
        super(books);
    }

    public LibraryCatalog() {
        super();
    }

    public void displayBooksInLibrary(Library library) {  //displays list of all available books in library
        System.out.println("Name of books    \t\t      Author   \t\t      PublicationYear\n");
        for (int i = 0; i < library.books.size(); i++) {
            if (library.books.get(i).available.equals("available")) {
                System.out.println(String.format("%-30s %-30s %-30s", library.books.get(i).bookName, library.books.get(i).author, library.books.get(i).publishedOn));
            }
        }
        displayBooksInLibrary = true;
    }

    String availability(String bookName, Library library) {  //checks for the availability of books in library
        for (int i = 0; i < library.books.size(); i++) {
            if (library.books.get(i).bookName.equals(bookName)) {
                return library.books.get(i).available;
            }
        }
        return "That book is not available.";
    }

    public String tryToCheckOut(String bookname, Library library) {  //if book is available it give the book
        if (availability(bookname, library).equals("available")) {
            for (int i = 0; i < library.books.size(); i++) {
                if (library.books.get(i).bookName.equals(bookname)) {
                    library.books.get(i).available = "unavailable";
                }
            }
            return "Thank you! Enjoy the book";
        }
        return "That book is not available.";
    }

    public String returnbook(String bookname, Library library) {   //if book belonged to this library library takes it back
        for (int i = 0; i < library.books.size(); i++) {
            if (availability(bookname, library).equals("unavailable")) {
                if (library.books.get(i).bookName.equals(bookname)) {
                    library.books.get(i).available = "available";
                    return "Thank you for returning the book.";
                }
            }
        }
        return "That is not a valid book to Return.";
    }


}
