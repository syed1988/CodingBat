package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/18/16.
 */
public class FrontBack {
    //Given a string, return a new string where the first and last chars have been exchanged.

    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));

    }

    private static String frontBack(String str) {
        char front = str.charAt(0);
        char back = str.charAt(str.length()-1);

        if (str.length() <= 1)
        return str;
        return back + str.substring(1, str.length()-1) + front;

    }
}
