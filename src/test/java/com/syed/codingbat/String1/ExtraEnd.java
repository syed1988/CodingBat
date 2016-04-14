package com.syed.codingbat.String1;

/**
 * Created by syed on 2/25/16.
 */
public class ExtraEnd {

//Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
// The string length will be at least 2.

    public static void main(String[] args) {

        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));

    }

    private static String extraEnd(String str) {

        String end = str.substring(str.length()-2);
        return end + end + end;
    }
}
