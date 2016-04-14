package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/22/16.
 */
public class LastDigit {

//Given two non-negative int values, return true if they have the same last digit,
//such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

    public static void main(String[] args) {

        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));

    }

    private static boolean lastDigit(int a, int b) {

        return  (a % 10 == b % 10 );

    }


}
