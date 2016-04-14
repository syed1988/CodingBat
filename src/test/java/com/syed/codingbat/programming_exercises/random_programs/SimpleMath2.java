package com.syed.codingbat.programming_exercises.random_programs;

import java.util.Scanner;

/**
 * Created by sayem on 2/24/16.
 */
public class SimpleMath2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int firstNum;
        int secondNum;


            System.out.println("what is the first number?");
            if (scan.hasNextInt()){
                firstNum= scan.nextInt();
            }else {
                System.out.println("ERROR");
            }

            /*
            firstNum = scan.nextInt();
              while (firstNum < 0 || firstNum > 1000000) {
                  System.out.println("Please Enter a valid numeric value");
                  firstNum = scan.nextInt();

             }
            */

            System.out.println("What is the second number");
            if (scan.hasNextInt()) {
                secondNum = scan.nextInt();
            }else {
                System.out.println("Error 2");
            }
        /*
        while (secondNum < 0 || secondNum > 1000000) {
              System.out.println("Please Enter a valid numeric value");
              secondNum = scan.nextInt();
            }

            System.out.println();
            System.out.println((firstNum + secondNum) + "\n" + (firstNum - secondNum) +
                    "\n" + (firstNum * secondNum) + "\n" + (firstNum / secondNum));
            */
    }


}
