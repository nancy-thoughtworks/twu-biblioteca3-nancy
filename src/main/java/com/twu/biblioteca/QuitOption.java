package com.twu.biblioteca;

public class QuitOption implements MenuOption {


    public String command() {
        return "Q";
    }

    public String toString() {
        return "Quit";
    }

    public void display() {
        System.out.print("");
    }

    public void execute(Library library) {
        System.exit(0);
    }
}
