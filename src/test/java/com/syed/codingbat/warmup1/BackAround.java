package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/19/16.
 */
public class BackAround {
//Given a string, take the last char and return a new string
//with the last char added at the front and back, so "cat" yields "tcatt".
//The original string will be length 1 or more.
    public static void main(String[] args) {

        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));

    }

    private static String backAround(String str) {
        char lastCharacter = str.charAt(str.length()-1);
        return lastCharacter + str + lastCharacter;
    }

}
