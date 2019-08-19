package com.twu.biblioteca;

public class Library {

    private ArrayList<Book> items;

    public Library(){
        this.items = new ArrayList<Book>();
    }

    public void addItems(Book... libraryItemsToAdd){
        for(Book item : libraryItemsToAdd){
            items.add(item);
        }
    }

    public void listBooks(){
        System.out.println("Available books:");
        for (Book item : books()){
            System.out.println(item.getDetails());
        }
    }


}
