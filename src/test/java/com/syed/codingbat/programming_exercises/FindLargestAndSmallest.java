package com.syed.codingbat.programming_exercises;

/**
 * Created by sayem on 2/23/16.
 */
public class FindLargestAndSmallest {

    public static void main(String[] args) {

        int array[] = new int[5];
        array[0] = 2;
        array[1] = 6;
        array[2] = 9;
        array[3] = 13;
        array[4] = 98;

        int largest = array[0];
        int smallest = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] > largest){
                largest = array[i];
            }
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        System.out.println("Largest array " + largest);
        System.out.println("Smallest array " + smallest);
    }
}
