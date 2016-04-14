package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/22/16.
 */
public class StringE {

//Return true if the given string contains between 1 and 3 'e' chars.

    public static void main(String[] args) {

        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));

    }

    private static boolean stringE(String str) {

        int counter = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.substring(i, i+1).contains("e"))
                counter++;
        }
        return counter >= 1 && counter <=3;
    }


}
