package com.syed.codingbat.String1;

/**
 * Created by syed on 2/25/16.
 */
public class MakeOutWord {

//Given an "out" string length 4, such as "<<>>", and a word,
//return a new string where the word is in the middle of the out string,
//e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting
// at index i and going up to but not including index j.

    public static void main(String[] args) {

        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "Woohoo"));
        System.out.println(makeOutWord("<<>>", "word"));

    }

    private static String makeOutWord(String out, String word) {

        String partOne = out.substring(0,2);
        String partTwo = out.substring(2,4);
        return partOne + word + partTwo;

    }
}
