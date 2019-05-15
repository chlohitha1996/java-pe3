package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTest {
    OddEven p=new OddEven();
    int[] as={20,11,46};

    @Test
    public void evenTest()
    {

        String[] s=p.isEven(as);
        String[] a={"even","odd","even"};

        assertEquals(a,s);

    }

    @Test
    public void primeTest()
    {
        int[] pr={40,37,11};
        int[] s=p.isPrim(pr);
        int[] c={40};
        assertArrayEquals(c,s);
    }
    @Test
    public void reverseTest()
    {
        int[] s=p.isRev(as);
        int[] a={46,11,20};
        assertArrayEquals(a,s);
    }

}