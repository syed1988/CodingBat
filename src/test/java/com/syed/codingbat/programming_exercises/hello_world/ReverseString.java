package com.syed.codingbat.programming_exercises.hello_world;

/**
 * Created by syed on 3/10/16.
 */
public class ReverseString {
    public static void main(String[] args) {

        String original = "Syed";
        String reverse = "";

        int length = original.length();

        for ( int i = length -1 ; i >= 0 ; i-- )
            reverse = reverse + original.charAt(i);

        System.out.println("Reverse of entered string is: "+reverse);

    }
}
