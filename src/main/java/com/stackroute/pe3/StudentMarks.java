package com.stackroute.pe3;
import java.util.*;
public class StudentMarks {
    public String isValid(int a)
    {
        String res="";
        if ((a>=0) && (a<=100)) {
            res ="true";

        }
        if (a>100) {
            res="Input should not be greater than 100";
        } if(a<0)
    {
        res="Input should not be less than 0";
    }

        return res;


    }
    public static void main(String args[]) {
        System.out.println("Enter the number of students");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] a = new int[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if ((a[i] >= 0) && (a[i] <= 100)) {
                System.out.println("true");

            }
            if (a[i] > 100) {
                System.out.println("Input should not be greater than 100");
            } if(a[i]<0)
            {
                System.out.println("Input should not be less than 0");
            }



        }
    }

}

