package com.twu.biblioteca;

import java.util.*;
import java.util.stream.Collectors;

public class Menu {
    private Library library;
    private ArrayList<MenuOption> options;

    public Menu(Library library) {
        this.library = library;
        options = new ArrayList<MenuOption>();
        ListOption listOp = new ListOption();
        CheckOutOption checkoutOp = new CheckOutOption();
        CheckIn checkin = new CheckIn();
        QuitOption quitOp = new QuitOption();
        options.add(listOp);
        options.add(checkoutOp);
        options.add(checkin);
        options.add(quitOp);

    }

    public void showOptions() {
        System.out.println("*****Menu Options*****");
        for (MenuOption o : options) {
            System.out.println("Press " + o.command() + " to " + o);
        }
    }

    public void chooseOption(String userInput){
        if(!isValidOption(userInput)){
            System.out.println("Please select a valid option");
        } else {
            MenuOption chosenOp;
            chosenOp = options.stream()
                    .filter(option -> userInput.equals(option.command()))
                    .collect(Collectors.toList())
                    .get(0);
            chosenOp.display();
            chosenOp.execute(library);
        }
    }

    private boolean isValidOption(String userInput){
        return options.stream().anyMatch(
                option -> userInput.equals(option.command())
        );
    }


}
