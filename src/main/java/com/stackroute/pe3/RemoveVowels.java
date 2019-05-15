package com.stackroute.pe3;

public class RemoveVowels {
    public String[] vowelsRemove(String[] instruments) {


        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = instruments[i].replaceAll("[aAEeiIOouU]", "");
            System.out.println(instruments[i]);
        }
        return instruments;

    }

    public String nullPointerException(String s) {

        String lohi="";
        if (s == "") {
            lohi = "input string cannot be null";

        }

        return lohi;
    }



    public String numericalValues(String s){
        String lohi="";
        if (!s.matches("[a-zA-Z_]+")) {

            lohi = "input string should have only characters";

        }

return lohi;

        }
    }


