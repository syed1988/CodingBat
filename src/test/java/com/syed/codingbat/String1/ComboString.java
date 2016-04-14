package com.syed.codingbat.String1;

/**
 * Created by syed on 2/25/16.
 */
public class ComboString {

//Given 2 strings, a and b, return a string of the form short+long+short,
//with the shorter string on the outside and the longer string on the inside.
//The strings will not be the same length, but they may be empty (length 0).

    public static void main(String[] args) {

        System.out.println(comboString("Hello", "hi"));
        System.out.println(comboString("hi", "Hello"));
        System.out.println(comboString("aaa", "b"));

    }

    private static String comboString(String a, String b) {

        if (a.length() > b.length()){
            return b + a + b;
        }

        return a + b + a;
    }

}
