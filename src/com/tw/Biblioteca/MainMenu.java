package com.tw.Biblioteca;

/**
 * Created by kvivek on 14/01/15.
 */
public class MainMenu {  //it is to map to specific menuItems selected

    public MenuItems get(String menuItem) {  //mapping is done here
       if (menuItem.equals("BookList")){
            return new ListOfBooks();
        }
       if(menuItem.equals("Checkout")){
            return new Checkout();
        }
       else if(menuItem.equals("ReturnBooks")){
            return new Return();
        }
        else if(menuItem.equals("Quit")){
            return new Quit();
        }
        else{
            return new MenuItems();
        }
    }

}
