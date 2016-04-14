package com.syed.codingbat.programming_exercises.random_programs;

import java.util.Scanner;

/**
 * Created by syed on 2/24/16.
 */
public class SimpleMath {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstNum;
        String secondNum;

        System.out.println("what is the first number?");
        firstNum = scan.nextLine();
        System.out.println("What is the second number");
        secondNum = scan.nextLine();

        int firstNumInt = Integer.parseInt(firstNum);
        int secondNumInt = Integer.parseInt(secondNum);

        System.out.println();
        System.out.println((firstNumInt + secondNumInt) +"\n"+ (firstNumInt - secondNumInt) +
        "\n" + (firstNumInt * secondNumInt) + "\n" + (firstNumInt / secondNumInt));

    }

}
