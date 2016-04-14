package com.syed.codingbat.programming_exercises.random_programs;

import java.util.Scanner;

/**
 * Created by syed on 2/23/16.
 */
public class CountNumbers {
    public static void main(String[] args) {

        String inputString;
        int stringLength;
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the input String? ");
        inputString = scan.nextLine();
        while (inputString.isEmpty()){
            System.out.println("No characters entered");
            inputString = scan.nextLine();
        }
        stringLength = inputString.length();

        System.out.println(inputString +" has "+ stringLength + " characters.");

    }
}
