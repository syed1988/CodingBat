package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/22/16.
 */
public class EndUp {

//Given a string, return a new string where the last 3 chars are now in upper case.
//If the string has less than 3 chars, uppercase whatever is there.
//Note that str.toUpperCase() returns the uppercase version of a string.

    public static void main(String[] args) {

        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));


    }

    private static String endUp(String str) {

        if (str.length() < 3)
            return str.toUpperCase();

        return str.substring(0,str.length()-3) + str.substring(str.length() -3, str.length()).toUpperCase();

    }
}
