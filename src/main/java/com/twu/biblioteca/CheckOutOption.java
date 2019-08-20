package com.twu.biblioteca;

import java.util.Scanner;

public class CheckOutOption implements MenuOption {
    public String command() {
        return "O";
    }

    public String toString() {
        return "Checkout";
    }

    public void display() {
        System.out.println("Enter the item ID you wish to borrow");
    }
    public void execute(Library library) {
        //Scanner scanner = new Scanner(System.in);
        //int itemID = scanner.nextInt();
        library.checkOut();
    }

}
