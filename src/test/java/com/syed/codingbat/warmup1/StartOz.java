package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/20/16.
 */
public class StartOz {

//Given a string, return a string made of the first 2 chars (if present),
//however include first char only if it is 'o' and include the second only if it is 'z',
//so "ozymandias" yields "oz".

    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));

    }

    private static String startOz(String str) {

       String result ="";
        if (str.length() >= 1 && str.charAt(0) == 'o'){
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z'){
            result = result + str.charAt(1);
        }
        return result;

    }
}
