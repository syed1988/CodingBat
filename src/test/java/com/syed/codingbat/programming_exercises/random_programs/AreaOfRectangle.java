package com.syed.codingbat.programming_exercises.random_programs;

import java.util.Scanner;

/**
 * Created by syed on 2/24/16.
 */
public class AreaOfRectangle {

//Revise the program to ensure that inputs are entered as numeric values.
//Don’t allow the user to proceed if the value entered is not numeric.
//Create a newversion of the program that allows you to choose
//feet or meters for your inputs.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double length;
        double width;

        System.out.println("What is the length of the room in feet? ");
        length = scan.nextDouble();

        System.out.println("What is the width of the room in feet? ");
        width = scan.nextDouble();

        double area = length * width;
        double roundArea = Math.round(area*100) / 100.0;
        final double areaInMeters = area * 0.09290304;
        double roundAreaInMeters = Math.round(areaInMeters * 100) / 100.0;

        System.out.println("You entered dimensions of "+ length +
                " feet by "+ width + " feet.");
        System.out.println("The area is "+"\n"+roundArea+ " Square feet"+ "\n"+
        roundAreaInMeters + " square meters");
    }

}
