package com.stackroute.pe3;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks x ;
    @Before
    public void setUp() {
        //arrange
        x = new StudentMarks();
    }

    @After
    public void tearDown() {
        //arrange
        x = null;
     }
   @Test
    public void ValidValueExpectedToReturnValidOrNot()
    {
        String z=x.isValid(30);
        assertEquals("true",z);
    }
    @Test
    public void GreaterThanRangeExpectedToReturnErrorMessage()
    {
        String z=x.isValid(109);
        assertEquals("Input should not be greater than 100",z);
    }
    @Test
    public void LessThanRange_ExpectedToReturnErrorMessage()
    {
        String z=x.isValid(-7);
        assertEquals("Input should not be less than 0",z);
    }

}

