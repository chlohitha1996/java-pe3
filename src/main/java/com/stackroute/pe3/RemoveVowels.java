package com.stackroute.pe3;

public class RemoveVowels { //To remove all Voewls
    public String[] vowelsRemove(String[] instruments) {


        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = instruments[i].replaceAll("[aAEeiIOouU]", "");
            System.out.println(instruments[i]);
        }
        return instruments;

    }

    public String nullPointerException(String s) { //To catch null pointer exception

        String string="";
        if (s == "") {
            string = "input string cannot be null";

        }

        return string;
    }


//To check if numbers are passed in string
    public String numericalValues(String s){
        String string="";
        if (!s.matches("[a-zA-Z_]+")) {

            string = "input string should have only characters";

        }

return string;

        }
    }


