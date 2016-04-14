package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/19/16.
 */
public class Or35 {

//Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
//Use the % "mod" operator

    public static void main(String[] args) {
        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));

    }

    private static boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);

    }
}
