package com.syed.codingbat.programming_exercises;

/**
 * Created by sayem on 2/23/16.
 */
public class OddEvenArray {
    public static void main(String[] args) {

        int array[] = new int[5];
        array[0] = 2;
        array[1] = 6;
        array[2] = 9;
        array[3] = 13;
        array[4] = 98;


        for (int i =0; i < array.length; i++){
            if (array[i] % 2 == 0){
                System.out.println(array[i] + " is Even");
            }else{
                System.out.println(array[i] + " is Odd");
            }
        }


    }
}
