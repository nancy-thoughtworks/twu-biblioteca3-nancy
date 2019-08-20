package com.twu.biblioteca;

public interface MenuOption {
    public String command();

    public String toString();
    public void display();

    public void execute(Library library);
}
