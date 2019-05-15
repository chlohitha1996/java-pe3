package com.stackroute.pe3;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks x = new StudentMarks();

    @Test
    public void ValidValue()
    {
        String z=x.isValid(30);
        assertEquals("true",z);
    }
    @Test
    public void GreaterThanRange()
    {
        String z=x.isValid(109);
        assertEquals("Input should not be greater than 100",z);
    }
    @Test
    public void LessThanRange()
    {
        String z=x.isValid(-7);
        assertEquals("Input should not be less than 0",z);
    }

}

