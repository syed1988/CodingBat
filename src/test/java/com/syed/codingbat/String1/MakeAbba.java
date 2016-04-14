package com.syed.codingbat.String1;

/**
 * Created by syed on 2/25/16.
 */
public class MakeAbba {

//Given two strings, a and b, return the result of putting them together in the order abba,
// e.g. "Hi" and "Bye" returns "HiByeByeHi".
    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));


    }

    private static String  makeAbba(String a, String b) {

        return a + b + b + a;

    }
}
