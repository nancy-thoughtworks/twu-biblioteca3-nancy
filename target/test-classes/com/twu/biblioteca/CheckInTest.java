package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CheckInTest {
    private CheckIn checkin;

    @Before
    public void setUp() {
        checkin = new CheckIn();

    }

    @Test
    public void callCheckIn(){
        Library library = mock(Library.class);
        checkin.execute(library);
        verify(library, times(1)).checkIn();
    }
}
