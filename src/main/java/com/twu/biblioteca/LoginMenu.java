package com.twu.biblioteca;

import java.util.*;
import java.util.Scanner;

public class LoginMenu {
    private String inUsername;
    private String inPassword;
    private Library library;

    public LoginMenu(Library library) {
        this.library = library;
    }

    public boolean showLogin() {
        System.out.println("*****LOGIN*****");
        System.out.println("Enter username");
        Scanner scanner = new Scanner(System.in);

        inUsername = scanner.next();

        System.out.println("Enter password");
        inPassword = scanner.next();

        if (library.login(inUsername, inPassword)) {
            System.out.println("login success");
            return true;
        } else {
            System.out.println("login failure");
            return false;
        }
    }
}
