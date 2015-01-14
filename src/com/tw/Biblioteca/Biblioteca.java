package com.tw.Biblioteca;

/**
 * Created by kvivek on 13/01/15.
 */
public class Biblioteca {       //To say interface to what to do at time of first interaction
    private UserInterface ui;
    public Biblioteca(UserInterface ui) {
        this.ui=ui;
    }  //tells interface for welcome message

    public void start() {
        ui.showWelcomeMessage();
    }  //checks if message reaches interface or not
}
