package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {

    User user;

    @Before
    public void setUp() {
        user = new User(
                "111-1111",
                "mmm");

    }

    @Test
    public void authenticateTrue() {
        assertEquals(true, user.authenticate("111-1111", "mmm"));
    }

    @Test
    public void authenticateFalse() {
        assertEquals(false, user.authenticate("111-1111", "zzz"));
    }

    @Test
    public void authenticateNoCred() {
        assertEquals(false, user.authenticate("111-1114", "zzz"));
    }
}
