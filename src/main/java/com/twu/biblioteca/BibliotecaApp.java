package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        WelcomeMessage msg = new WelcomeMessage();
        msg.printMessage();
        Library lib = new Library();

        while(true) {
            Menu menu = new Menu(lib);
            menu.showOptions();
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            menu.chooseOption(userInput);
        }

    }
}
