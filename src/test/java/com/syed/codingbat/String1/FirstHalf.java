package com.syed.codingbat.String1;

/**
 * Created by syed on 2/25/16.
 */
public class FirstHalf {

//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

    public static void main(String[] args) {

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));

    }

    private static String firstHalf(String str) {

        return str.substring(0, str.length() / 2);
    }

}
