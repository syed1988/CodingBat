package com.syed.codingbat.warmup1;

/**
 * Created by sayem on 2/18/16.
 */
public class Front3 {

  //Given a string, we'll say that the front is the first 3 chars of the string.
    // If the string length is less than 3, the front is whatever is there.
    // Return a new string which is 3 copies of the front.

    public static void main(String[] args) {
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("ab"));

    }

    private static String front3(String str) {

        String front;
        if (str.length() > 3){
            front = str.substring(0,3);
        }else {
            front = str;
        }
        return front + front + front;
    }
}
