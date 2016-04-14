package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/20/16.
 */
public class MixStart {

//Return true if the given string begins with "mix",
//except the 'm' can be anything, so "pix", "9ix" .. all count.
public static void main(String[] args) {

    System.out.println(mixStart("mix snacks"));
    System.out.println(mixStart("pix snacks"));
    System.out.println(mixStart("piz snacks"));
}

    private static boolean mixStart(String str) {

        if (str.length() < 3)
            return false;
        String two = str.substring(1,3);
       return (two.equals("ix"));

    }
}
