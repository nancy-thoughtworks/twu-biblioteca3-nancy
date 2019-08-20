package com.twu.biblioteca;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(Integer id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true;
    }

    public int getID() {
        return id;
    }
    public String getTitle() {
        return this.title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean value) {
        this.available = value;
    }

    public String toString() {
        return this.title + ", " +
                this.author + ", " +
                this.year;
    }


}
