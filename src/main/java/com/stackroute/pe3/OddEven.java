package com.stackroute.pe3;

public class OddEven {

    public String[] isEven(int[] n) {
        String[] s=new String[n.length];
        for(int i=0;i<n.length;i++)
            if (n[i] % 2 == 0) {
                s[i]="even";
            }

            else
                s[i]="odd";
        return s;
    }


    public int[] isPrim(int n[])
    {
        int count=0;
        for (int i=0;i<n.length;i++) {

            for (int j = 2; j <= n[i] / 2; j++) {
                if (n[i] % j == 0) {

                    count++;
                    break;
                }

            }
        }

        int[] s = new int[count];

        int x=0,j;
        for (int i=0;i<n.length;i++) {

            for (j = 2; j <= n[i] / 2; j++) {
                if ((n[i] % j) == 0) {

                    s[x]=n[i];
                    x++;
                    break;
                }

            }
        }
        return s;
    }

    public int[] isRev(int[] n) {

        int[] s = new int[n.length];
        int x=0;
        for (int i = n.length-1; i >= 0; i--) {

            s[x] += n[i];
            x++;
        }
        return s;
    }

}