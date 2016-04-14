package com.syed.codingbat.warmup2;

/**
 * Created by syed on 4/13/16.
 */
public class CountXX {

    //Count the number of "xx" in the given string.
    //We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));

    }

    private static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++){

            if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
                count++;
            }
        }
        return count;
    }

}
