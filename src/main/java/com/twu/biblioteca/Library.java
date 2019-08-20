package com.twu.biblioteca;

import java.util.*;

public class Library {
    private HashMap<Integer, Book> items;
    //private ArrayList<Book> items;
    private HashMap<String, User> users;

    public Library(){
        this.items = new HashMap<Integer, Book>();
        this.users = new HashMap<String, User>();
    }

    public void addItems(Book item){
        this.items.put(item.getID(), item);
    }

    public void listBooks(){

        for (Map.Entry<Integer, Book> entry : items.entrySet()){
            if (entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().toString());
            }
        }
    }
    public Book lookupItem(Integer id) {
        return items.get(id);
    }

    public void createUser(String username, User user) {
        this.users.put(username, user);
    }

    private User lookupUser(String username) {
        return users.get(username);
    }

    public boolean login(String username, String password) {
        User u = lookupUser(username);
        if (u!=null) {
            return u.authenticate(username, password);
        } return false;

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
