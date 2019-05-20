package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class ExceptionTest {
    Exception app;


    @Before
    public void setUp() {
        //arrange
        app = new Exception();


    }

    @After
    public void tearDown() {
        //arrange
        app = null;


    }

    @Test
    public void arithmeticException_ExpectedRetrieveCaughtException() { //Not asked in P.e 3


        //act
        String result = app.arithmeticException(3, 0);

        //assert
        assertEquals("Can't divide a number by 0", result);
    }

    @Test
    public void negativeArraySizeException_ExpectedRetrieveCaughtException() { ////Not asked in P.e 3


        //act
        String result = app.negativeArraySizeException(-8);

        //assert
        assertEquals("Can't create array of negative size", result);
    }


    @Test
    public void nullPointerException_ExpectedRetrieveCaughtException() {


        //act
        String result = app.nullPointerException(0);
        //assert
        assertEquals("NullPointerException..", result);
    }

    @Test
    public void arrayIndexOutOfBound_ExpectedRetrieveCaughtException() {


        //act
        String result = app.arrayIndexOutOfBound(5);
        //assert
        assertEquals("Wrong index number, please enter correct number. ", result);
    }
    @Test
    public void stringIndexOutOfBoundsException_ExpectedRetrieveCaughtException() {


        //act
        String result = app.stringIndexOutOfBoundsException(5);
        //assert
        assertEquals("Wrong character index number, please enter correct number. ", result);
    }




}





