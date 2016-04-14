package com.syed.codingbat.String1;

/**
 * Created by syed on 2/25/16.
 */
public class HelloWorld {
//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

    public static void main(String[] args) {

        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));



    }

    private static String helloName(String name) {

        return "Hello "+ name + "!";
    }

}
