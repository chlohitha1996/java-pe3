package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringObjectTest {


    StringObject a=new StringObject();
    @Test

    public  void compare()
    {
        String[] a1={"80","20","30"};
        String[] a2={"10","90","40"};
        String s="not equal";
        assertEquals(s,a.compare(a1,a2));

    }
    @Test
    public void Duplicate()
    {
        String[] a1={"63","63","15","90"};
        String s="duplicates found";
        assertEquals(s,a.Duplicate(a1));
    }
    @Test
    public void append()
    {
        String[] a1={"17","18","19"};
        String[] a2={"20","30","40"};
        String[] s={"17","18","19","20"};
        assertArrayEquals(s,a.append(a1,a2));
    }

    @Test
    public void prepend()
    {
        String[] a1={"17","18","19"};
        String[] a2={"20","30","40"};
        String[] s={"30","17","18","19"};
        assertArrayEquals(s,a.prepend(a1,a2));
    }

}