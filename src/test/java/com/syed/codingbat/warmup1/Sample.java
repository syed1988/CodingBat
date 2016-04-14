package com.syed.codingbat.warmup1;

/**
 * Created by sayem on 4/4/16.
 */
public class Sample {

    public static void main(String[] args) {

        int[] array = {1,3,5,13,2};
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] != 13){
                sum += array[i];
            }
        }
        System.out.println(sum);


    }
}
