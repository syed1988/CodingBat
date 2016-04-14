package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/18/16.
 */
public class SumDouble {
    public static void main(String[] args) {
        //Given two int values, return their sum. Unless the two values are the same,
        // then return double their sum.

        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(3,2));
        System.out.println(sumDouble(2,2));

    }

    private static int sumDouble(int a, int b) {

        if (a == b){
            return ((a+b) * 2);
        }
        return a + b;

    }
}
