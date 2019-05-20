package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.*;

public class ConsecutiveNumbersTest {

    ConsecutiveNumbers c;
    @Before
    public void setup() {
        c = new ConsecutiveNumbers();
    }

    @After
    public void tearDown() {
        c = null;
    }


    @Test
    public void testConsecutiveNumbersExpectedConsecutive() {

        String s = "10,11,12,13,14,15,16,17";
        assertEquals(
                "check in sequential order if is it consecutive or not",
                "consecutive", c.getConsecutiveNumbers(s));
    }
    @Test
    public void testConsecutiveNumberExpectedNonConsecutive() {
        String s = "10,20,30,40,50,60";
        assertEquals(
                "check is it non consecutive or not",
                "non consecutive", c.getConsecutiveNumbers(s));
    }
    @Test
    public void testConsecutiveExpectedConsecutive() {
        String s = "11,10,9,8,7,6";
        assertEquals(
                "check in reverse order if is it consecutive or not",
                "consecutive", c.getReverseConsecutiveNumbers(s));
    }
    @Test
    public void testConsecutiveNegativeExpectedConsecutive() {
        String s = "0,-1,-2,-3,-4,-5";
        assertEquals(
                "check in reverse order if is it consecutive or not",
                "consecutive", c.getNegativeConsecutiveNumbers(s));
    }
    @Test
    public void testConsecutiveSameExpectedNonConsecutive() {
        String s = "6,6,6,6,6,6";
        assertEquals(
                "check in reverse order if is it consecutive or not",
                "non consecutive", c.getConsecutiveNumbers(s));
    }


}