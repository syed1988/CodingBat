package com.syed.codingbat.programming_exercises.random_programs;

import java.util.Scanner;

/**
 * Created by Syed on 2/24/16.
 */
public class MadLIb {

    public static void main(String[] args) {

        String noun;
        String verb;
        String adjective;
        String adverb;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        noun = scan.nextLine();

        System.out.println("Enter a verb: ");
        verb = scan.nextLine();

        System.out.println("Enter an adjective: ");
        adjective = scan.nextLine();

        System.out.println("Enter an adverb: ");
        adverb = scan.nextLine();

        System.out.println("Do you " + verb + " your " + adjective +" "+ noun + " "+ adverb + " ?");
    }
}
