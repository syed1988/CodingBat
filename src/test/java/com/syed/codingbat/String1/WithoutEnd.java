package com.syed.codingbat.String1;

/**
 * Created by syed on 2/25/16.
 */
public class WithoutEnd {
//Given a string, return a version without the first and last char,
//so "Hello" yields "ell". The string length will be at least 2.

    public static void main(String[] args) {

        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));

    }

    private static String withoutEnd(String str) {

        return str.substring(1, str.length()-1);

    }
}
