package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/19/16.
 */
public class StartHi {
//Given a string, return true if the string starts with "hi" and false otherwise.

    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));

    }

    private static boolean startHi(String str) {

        return str.startsWith("hi");

    }


}
