package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/18/16.
 */
public class NotString {
    //Given a string, return a new string where "not " has been added to the front.
    //However, if the string already begins with "not", return the string unchanged.
    // Note: use .equals() to compare 2 strings.

    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));

    }

    private static String notString(String s) {

        if (s.startsWith("not"))
            return s;

        return "not " + s;

    }
}
