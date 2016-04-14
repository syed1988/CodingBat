package com.syed.codingbat.programming_exercises.hello_world;

import java.util.Scanner;

/**
 * Created by syed on 2/23/16.
 */
public class HelloWorld {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int max = 0;
            int imax = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0.

                if (mountainH > max) {
                    max = mountainH;
                    imax = i;
                }

            }

            System.out.println(imax); // The number of the mountain to fire on.
        }
    }

}
