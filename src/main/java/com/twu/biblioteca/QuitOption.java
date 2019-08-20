package com.twu.biblioteca;

public class QuitOption implements MenuOption {


    public String command() {
        return "Q";
    }

    public String toString() {
        return "Quit";
    }

    public void execute(Library library) {
        System.exit(0);
    }
}
