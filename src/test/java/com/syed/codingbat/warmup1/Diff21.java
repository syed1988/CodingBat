package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/18/16.
 */
public class Diff21 {

    //Given an int n, return the absolute difference between n and 21,
    // except return double the absolute difference if n is over 21.

    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(25));

    }

    private static int diff21(int n) {

        if (n > 21)
            return (n - 21) * 2;

        return 21 - n;
    }

}
