package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        run();
    }

    public static void run() {
        WelcomeMessage msg = new WelcomeMessage();
        msg.printMessage();

        Library library = new Library();
        Book book1 = new Book(1, "The Yield", "Jane Winch", 1990);
        Movie m1 = new Movie(2, "The Shining", "J Cohen",2000);
        library.addItems(book1);
        library.addItems(m1);


        LoginMenu loginM = new LoginMenu(library);
        while (loginM.showLogin()) {
            while(true) {
                Menu menu = new Menu(library);
                menu.showOptions();
                Scanner scanner = new Scanner(System.in);
                String userInput = scanner.nextLine();

                menu.chooseOption(userInput);
            }

        }

/*        while(true) {
            Menu menu = new Menu(library);
            menu.showOptions();
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            menu.chooseOption(userInput);
        }*/

    }
}
