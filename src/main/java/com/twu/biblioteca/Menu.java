package com.twu.biblioteca;

import java.util.*;

public class Menu {
    private Library library;
    private ArrayList<MenuOption> options;

    public Menu(Library library) {
        this.library = library;
        options = new ArrayList<MenuOption>();
        ListOption listOp = new ListOption();
        CheckOutOption checkoutOp = new CheckOutOption();
        QuitOption quitOp = new QuitOption();
        options.add(listOp);
        options.add(checkoutOp);
        options.add(quitOp);

    }

    public void display() {
        System.out.println("*****Menu Options*****");
        for (MenuOption o : options) {
            System.out.println("Press " + o.command() + " to " + o);
        }

    }


}
