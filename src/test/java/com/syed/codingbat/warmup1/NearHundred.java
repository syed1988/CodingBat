package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/19/16.
 */
public class NearHundred {
//Given an int n, return true if it is within 10 of 100 or 200.
// Note: Math.abs(num) computes the absolute value of a number.

    public static void main(String[] args) {
        System.out.println(nearHundred(111));//Expected "False"
        System.out.println(nearHundred(121));//Expected "False"
        System.out.println(nearHundred(211));//Expected "False

    }

    private static boolean nearHundred(int n) {

        return Math.abs(100 - n ) <=10 || Math.abs(200-n) <=10;

    }
}
