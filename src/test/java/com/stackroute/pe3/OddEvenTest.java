package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTest {
    OddEven p;
    int[] as={20,11,46};
    @Before
    public void setup() {
        p=  new OddEven();
    }

    @After
    public void tearDown() {
        p = null;
    }

    @Test
    public void evenTestExpectedTODisplayEvenOrOdd()
    {

        String[] s=p.isEven(as);
        String[] a={"even","odd","even"};

        assertEquals(a,s);

    }

    @Test
    public void primeTestExpectedTODisplayPrimeOrNot()
    {
        int[] pr={40,37,11};
        int[] s=p.isPrime(pr);
        int[] c={40};
        assertArrayEquals(c,s);
    }
    @Test
    public void reverseTestExpectedTODisplayReverse()
    {
        int[] s=p.isRev(as);
        int[] a={46,11,20};
        assertArrayEquals(a,s);
    }

}