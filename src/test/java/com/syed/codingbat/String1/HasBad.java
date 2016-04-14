package com.syed.codingbat.String1;

/**
 * Created by syed on 4/13/16.
 */
public class HasBad {

//Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
//such as with "badxxx" or "xbadxx" but not "xxbadxx".
//The string may be any length, including 0. Note: use .equals() to compare 2 strings.

    public static void main(String[] args) {

        System.out.println(hasBad("bad"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));

    }

    private static boolean hasBad(String str) {

        if (str.length() >= 3){
            if(str.substring(0,3).contains("bad")){
                return true;
            }else if(str.substring(1,4).contains("bad")){
                return true;
            }

        }
        return false;
    }
}
