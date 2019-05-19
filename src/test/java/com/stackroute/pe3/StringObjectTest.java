package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringObjectTest {


    StringObject a;
    @Before
    public void setUp() {
        //arrange
        a = new StringObject();
    }

    @After
    public void tearDown() {
        //arrange
        a = null;
    }


    @Test
    public  void compare_ExpectedToReturnEqualOrNot()
    {
        String[] a1={"80","20","30"};
        String[] a2={"10","90","40"};
        String s="not equal";
        assertEquals(s,a.compare(a1,a2));

    }
    @Test
    public void Duplicate_ExpectedToReturnContainsDuplicatesOrNot()
    {
        String[] a1={"63","63","15","90"};
        String s="duplicates found";
        assertEquals(s,a.duplicate(a1));
    }
    @Test
    public void append_ExpectedToReturnAppendedString()
    {
        String[] a1={"17","18","19"};
        String[] a2={"20","30","40"};
        String[] s={"17","18","19","20"};
        assertArrayEquals(s,a.append(a1,a2));
    }

    @Test
    public void prepend_ExpectedToReturnPrependedString()
    {
        String[] a1={"17","18","19"};
        String[] a2={"20","30","40"};
        String[] s={"30","17","18","19"};
        assertArrayEquals(s,a.prepend(a1,a2));
    }

}