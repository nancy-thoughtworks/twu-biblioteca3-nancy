package com.twu.biblioteca;

public class CheckOutOption implements MenuOption {
    public String command() {
        return "O";
    }

    public String toString() {
        return "Checkout";
    }

    public void execute(Library library) {
        //library.checkOut();
    }

}
