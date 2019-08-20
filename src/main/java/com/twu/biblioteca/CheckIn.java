package com.twu.biblioteca;

import java.util.Scanner;

public class CheckIn implements MenuOption {
    public String command() {
        return "I";
    }

    public String toString() {
        return "Checkin";
    }

    public void display() {
        System.out.println("Enter the item ID you wish to return");
    }

    public void execute(Library library) {
        library.checkIn();

    }
}
