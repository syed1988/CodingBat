package com.syed.codingbat.programming_exercises.random_programs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by syed on 2/25/16.
 */
public class PizzaParty {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = 0;
        int pizzas = 0;

        System.out.println("How many people? ");
        boolean isValid = false;
        while (!isValid){
            try {
                people = scan.nextInt();

                if (people > 0 && people < 1000){
                    isValid = true;
                }else {
                    System.out.println("Not a valid number");
                }
            }catch (InputMismatchException e){
                System.out.println("Enter a numeric value");
                scan.next();
            }
        }
        System.out.println("Valid input for number of people");

        System.out.println("How many pizzas? ");
        pizzas = scan.nextInt();

        int numberOfSlicesPerPerson = Math.abs((pizzas * 8) % people);

        int leftOver = numberOfSlicesPerPerson % people;
        System.out.println(people + " people with "+ pizzas + " pizzas");
        System.out.println("Each person gets "+ numberOfSlicesPerPerson +" pieces of pizza");
        System.out.println("There are "+leftOver+ " leftover pieces.");

    }


    /*
    private static void validNumber1To10(int number){
        boolean isValid = false;
        while (!isValid) {
            try {
                number = scan.nextInt();
                if (number >= 1 && number <= 10) {
                    isValid = true;
                }else {
                    System.out.println("OUt of range");
                }
            }catch (InputMismatchException e){
                System.out.println("not a valid number");
                scan.next();
            }
        }


    }
    */
}
