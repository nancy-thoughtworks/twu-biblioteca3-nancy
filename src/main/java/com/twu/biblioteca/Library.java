package com.twu.biblioteca;

import java.util.*;

public class Library {

    private ArrayList<Book> items;

    public Library(){
        this.items = new ArrayList<Book>();
    }

    public void addItems(Book item){
        items.add(item);
    }

    public void listBooks(){
        System.out.println("Available books:");
        for (Book item : items){
            System.out.println(item);
        }
    }


}
