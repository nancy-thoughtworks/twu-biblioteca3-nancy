package com.twu.biblioteca;

public class Borrower extends User {
    private String name;
    private String email;
    private int phone;

    public Borrower(String username, String password, String name, String email, int phone) {
        super(username, password);
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String toString() {
        return this.name +"\n"+  "email: " + this.email+ "\nphone:" + this.phone;
    }

}
