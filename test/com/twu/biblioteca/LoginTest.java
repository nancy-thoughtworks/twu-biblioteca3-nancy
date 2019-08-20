package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginTest {
    //User user;
    Library testlibrary;

    @Before
    public void setUp() {
        testlibrary = new Library();

        testlibrary.createUser("111-1111", new User(
                "111-1111",
                "mmm"));
    }

    @Test
    public void loginTrue() {
        assertEquals(true, testlibrary.login("111-1111", "mmm") );
    }

    @Test
    public void loginFalse() {
        assertEquals(false, testlibrary.login("111-1111", "mmxxx") );
    }

    @Test
    public void loginNotExist() {
        assertEquals(false, testlibrary.login("111-1311", "mmxxx") );
    }

}
