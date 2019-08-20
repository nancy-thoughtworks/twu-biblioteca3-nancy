package com.twu.biblioteca;

import java.util.*;

public class Library {
    private HashMap<Integer, Book> items;
    //private ArrayList<Book> items;

    public Library(){
        this.items = new HashMap<Integer, Book>();
    }

    public void addItems(Book item){
        this.items.put(item.getID(), item);
    }

    public void listBooks(){

        for (Map.Entry<Integer, Book> entry : items.entrySet()){
            System.out.println(entry.getValue().toString());
        }
    }
    public Book lookupItem(Integer id) {
        return items.get(id);
    }


    public void checkOut(){
        Scanner scanner = new Scanner(System.in);
        int itemID = scanner.nextInt();
        Book i = lookupItem(itemID);
        if(i.isAvailable()){
            i.setAvailable(false);
            System.out.println("Thank you! Enjoy the item");
        }
        else{
            System.out.println("That item is not available");
        }
    }

    public void checkIn(){
        Scanner scanner = new Scanner(System.in);
        int itemID = scanner.nextInt();
        Book i = lookupItem(itemID);
        if (i!=null && !i.isAvailable()) {
            i.setAvailable(true);
            System.out.println( "Thank you for returning the book");
        } else {
            System.out.println( "That is not a valid book to return");
        }
    }


}
