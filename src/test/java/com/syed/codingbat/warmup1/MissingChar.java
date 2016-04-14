package com.syed.codingbat.warmup1;

/**
 * Created by sayem on 2/18/16.
 */
public class MissingChar {
    //Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    //The value of n will be a valid index of a char in the original string
    // (i.e. n will be in the range 0..str.length()-1 inclusive).

    public static void main(String[] args) {
        System.out.println(missingChar("kitten",1));
        System.out.println(missingChar("kitten",0));
        System.out.println(missingChar("kitten",4));

    }

    private static String missingChar(String str, int n) {

        return str.substring(0, n) + str.substring(n+1, str.length());
    }

}
