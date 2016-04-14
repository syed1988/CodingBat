package com.syed.codingbat.programming_exercises.random_programs;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by syed on 2/24/16.
 */
public class RetirementCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int currentAge;
        int retirementAge;

        System.out.println("What is your current age? ");
        currentAge = scan.nextInt();

        System.out.println("At what age would you like to retire? ");
        retirementAge = scan.nextInt();

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int yearsLeftToRetire = retirementAge - currentAge;
        int yearToRetire = year + yearsLeftToRetire;

        System.out.println();
        if (yearsLeftToRetire < 0){
            System.out.println("You can retire already!");
            System.out.println("Your retirement year was: "+ (year + yearsLeftToRetire));
        }else {

            System.out.println("You have " + yearsLeftToRetire + " years left until you retire.");
            System.out.println("It's " + year + ", so you can retire in " + yearToRetire);
        }
    }
}
