package com.syed.codingbat.warmup1;

/**
 * Created by syed on 2/18/16.
 */
public class ParrotTrouble {
    public static void main(String[] args) {
        //We have a loud talking parrot.
        //The "hour" parameter is the current hour time in the range 0..23.
        // We are in trouble if the parrot is talking and the hour is before 7 or after 20.
        // Return true if we are in trouble.

        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 21));

    }

    private static boolean parrotTrouble(boolean talking, int hour) {

         return (talking && (hour < 7 || hour > 20));

    }
}
