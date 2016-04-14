package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/20/16.
 */
public class DelDel {

//Given a string, if the string "del" appears starting at index 1,
//return a string where that "del" has been deleted.
// Otherwise, return the string unchanged.
public static void main(String[] args) {

    System.out.println(delDel("adelbc"));
    System.out.println(delDel("adelHello"));
    System.out.println(delDel("adedbc"));
    System.out.println(delDel("ad"));

       }

    private static String delDel(String str) {

      if (str.length() > 4 && str.substring(1,4).startsWith("del"))
          return str.substring(0,1) + str.substring(4, str.length());

        return str;

    }
}
