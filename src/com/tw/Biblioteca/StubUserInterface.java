package com.tw.Biblioteca;

/**
 * Created by kvivek on 13/01/15.
 */
public class StubUserInterface implements UserInterface { //its interface for validation bibloteca interface
    public boolean showWelcomeMessageWasCalled;
    public boolean showsBooksInLibrary;
    public boolean menuItemsAreDisplayed;

    @Override
    public void showWelcomeMessage() {
        showWelcomeMessageWasCalled =true;
    }

    @Override
    public void showMainMenuItems() {
        showsBooksInLibrary=true;
    }


    public void showMainMenu(String s) {
        menuItemsAreDisplayed=true;
    }

}
