package com.stackroute.pe3;

public class StringObject {
    public String compare(String[] x,String[] y)
    {
        String res="";

        if(x.length==y.length)
        {
            for(int i=0;i<x.length;i++)
            {
                if(x[i]==y[i]){
                    res="equal";
                }
                else
                {
                    res="not equal";
                    break;
                }
            }

        }
        else{
            res="not equal";
        }

        return res;
    }

    public String Duplicate(String[] x)
    {
        String res="";
        for(int i=0;i<x.length;i++)
        {
            for(int j=1;j<x.length;j++)
            {
                if(x[i]==x[j]){
                    res="duplicates found";

                    break;

                }
                else{

                    res="no duplicates";
                }
            }
        }

        return res;
    }


    public String[] append(String[] x,String[] y)
    {
        String[] res=new String[x.length+1];
        for(int i=0;i<x.length;i++)
        {
            res[i]=x[i];

        }
        res[res.length-1]=y[0];

        return res;
    }


    public String[] prepend(String[] x,String[] y)
    {
        String[] res=new String[x.length+1];
        String temp=y[y.length/2];
        for(int i=0,j=1;i<x.length&&j<res.length;i++,j++)
        {

            res[j]=x[i];

        }

        res[0]=temp;

        return res;
    }
}
