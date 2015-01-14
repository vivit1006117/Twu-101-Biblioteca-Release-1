package com.tw.Biblioteca;

import java.util.Scanner;

/**
 * Created by kvivek on 14/01/15.
 */
public class Launcher { //Just helps app to start

    public static void main(String args[]) {  //calls methods neaded to run application

        ConsoleInterface display = new ConsoleInterface();
        display.showWelcomeMessage();
        String options = "";
        while (!options.equals("Quit")) {
            display.showMainMenuItems();
            System.out.println("Enter option to be selected");
            Scanner in = new Scanner(System.in);
            options = in.nextLine();
            display.menuItemSelected(options);

        }
    }
}
