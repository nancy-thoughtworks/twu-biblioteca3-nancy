package com.twu.biblioteca;

public class ListOption implements MenuOption {

    public String command() {
        return "L";
    }


    public String toString() {
        return "List items";
    }


    public void execute(Library library) {
        library.listBooks();
    }
}
