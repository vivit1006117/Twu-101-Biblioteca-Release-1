package com.tw.Biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Created by kvivek on 13/01/15.
 */
public class BibliotecaTest {
    Book books[] = new Book[]{new Book("Head first java", "O'Reilly", "2010"), new Book("Let us C", "Yaswant Kanetker", "2007"), new Book("Complete reference to C++", "Herb Schildt", "2006"), new Book("Ruby on Rails", "David Heinemeier Hansson", "2004"), new Book("Agile development", "Ken Schwaber", "2009")};
    Library library = new Library(books);


    @Test
    public void shouldShowWelcomeMessage() {
        StubUserInterface ui = new StubUserInterface();
        assertThat(ui.showWelcomeMessageWasCalled, is(false));
        new Biblioteca(ui).start();
        assertThat(ui.showWelcomeMessageWasCalled, is(true));
    }


}
