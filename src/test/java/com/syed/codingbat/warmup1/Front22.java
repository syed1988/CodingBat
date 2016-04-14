package com.syed.codingbat.warmup1;

/**
 * Created by sayem on 2/19/16.
 */
public class Front22 {

//Given a string, take the first 2 chars and return the string with
//the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
//If the string length is less than 2, use whatever chars are there.

    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("ha"));
        System.out.println(front22("c"));
    }

    private static String front22(String str) {
        if (str.length() < 2){
            return str + str + str;
        }
        String firstTwo = str.substring(0,2);
        return firstTwo + str + firstTwo;

    }

}
