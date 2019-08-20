package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import java.util.*;


import static org.junit.Assert.assertEquals;


public class ListBooksTest {
    ByteArrayOutputStream outputStream;
    Library testlibrary;
    Book testBook;
    Movie testMovie;

    @Before
    public void setUp() {
        testlibrary = new Library();
        testBook = new Book(1,"A book", "Eleanor Goodall", 1704);
        //testMovie = new Movie("The Lion King", "J Cohen",2019 );
        testlibrary.addItems(testBook);
        //testlibrary.addItems(testMovie);
    }

    @Test
    public void testListBooks() {
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testlibrary.listBooks();
        assertEquals("Available books:\n" +
                        "A book, Eleanor Goodall, 1704\n",
                outputStream.toString());

    }

}
