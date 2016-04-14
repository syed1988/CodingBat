package com.syed.codingbat.String1;

/**
 * Created by syed on 4/13/16.
 */
public class ExtraFront {
 //Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
 //The string may be any length. If there are fewer than 2 chars, use whatever is there.
    public static void main(String[] args) {

        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));

    }

    private static String extraFront(String str) {

        if(str.length() > 2){
            String front = str.substring(0,2);
            return front + front + front;
        }
        return str + str + str;
    }
}
