package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/20/16.
 */
public class In1020 {
//Given 2 int values, return true if either of them is in the range 10..20 inclusive.
public static void main(String[] args) {
    System.out.println(in1020(12, 99));
    System.out.println(in1020(21, 12));
    System.out.println(in1020(8, 99));

}

    private static boolean in1020(int a, int b) {


        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));

    }

}
