package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication){
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle(){
        return title;
    }

    public String getDetails() {
        return title + ", " + author + ", " + yearOfPublication;
    }
}
