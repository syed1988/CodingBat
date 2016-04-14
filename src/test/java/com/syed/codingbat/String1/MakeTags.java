package com.syed.codingbat.String1;

/**
 * Created by syed on 2/25/16.
 */
public class MakeTags {

//he web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
//In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
//Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

    public static void main(String[] args) {

        System.out.println(makeTags("i", "Yay"));
        System.out.println(makeTags("i", "Hello"));
        System.out.println(makeTags("cite", "Yay"));


    }

    private static String makeTags(String tag, String word) {

        return "<"+tag+">"+word+"</"+tag+">";

    }
}
