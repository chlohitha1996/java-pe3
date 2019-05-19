package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels oe;

    @Before
    public void setup() {
        oe=  new RemoveVowels();
    }

    @After
    public void tearDown() {
        oe = null;
    }


    @Test
    public void removeVowels_ExpectedReturnStringsWithNoVowels() {
        oe = new RemoveVowels();
        String[] str2 = {"cello", "guitar", "violin", "double bass"};

        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {"cll", "gtr", "vln", "dbl bss"};

        assertArrayEquals(str1, str);

    }
    @Test
    public void AllVowels_ExpectedNullString() {
        String[] str2 = {"aeiou", "AEIOU"};

        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {"",""};

        assertArrayEquals(str1, str);


    }

    @Test
    public void VowelsConsonants_ExpectedOnlyConsonants() {

        String[] str2 = {"d", "a", "e", "f"};

        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {"d","","","f",} ;

        assertArrayEquals(str1, str);


    }
    @Test
    public void nullPointer_ExpectedReturnErrorMessage() {

        String s = "";

        String str = oe.nullPointerException(s);
        assertEquals("input string cannot be null",str);


    }


    @Test
    public void numericalValues_ExpectedReturnErrorMessage() {

        String s = "1234";

        String str = oe.numericalValues(s);
        assertEquals("input string should have only characters",str);


    }


}