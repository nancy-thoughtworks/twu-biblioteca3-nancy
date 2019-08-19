package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WelcomeTest {

    private ByteArrayOutputStream outputStream;
    private WelcomeMessage welcomeMessage;

    @Test
    public void WelcomeMessageIsDisplayed(){
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        welcomeMessage = new WelcomeMessage();
        welcomeMessage.printMessage();
        assertEquals(
                "Welcome to Biblioteca. your one-stop-shop for great book titles in Bangalore!\n",
                outputStream.toString()
        );
    }
}
