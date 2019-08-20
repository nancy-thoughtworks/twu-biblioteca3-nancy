package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CheckOutTest {

    private CheckOutOption checkout;

    @Before
    public void setUp() {
        checkout = new CheckOutOption();

    }

    @Test
    public void callCheckOut(){
        Library library = mock(Library.class);
        checkout.execute(library);
        verify(library, times(1)).checkOut();
    }
}
