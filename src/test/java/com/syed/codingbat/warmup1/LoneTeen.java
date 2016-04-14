package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/20/16.
 */
public class LoneTeen {
//We'll say that a number is "teen" if it is in the range 13..19 inclusive.
//Given 2 int values, return true if one or the other is teen, but not both.

    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));

    }

    private static boolean loneTeen(int a, int b) {

        if (a >= 13 && a <=19 && b >=13 && b <=19 )
            return false;
        else if (a >= 13 && a <=19 || b >=13 && b <=19)
            return true;

        return false;
    }
}
