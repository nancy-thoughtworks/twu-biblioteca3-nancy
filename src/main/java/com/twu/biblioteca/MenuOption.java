package com.twu.biblioteca;

public interface MenuOption {
    public String command();

    public String toString();

    public void execute(Library library);
}
