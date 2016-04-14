package com.syed.codingbat.Array1;

/**
 * Created by syed on 4/13/16.
 */
public class FirstLast6 {
//Given an array of ints, return true if 6 appears as either the first or last element in the array.
// The array will be length 1 or more.

    public static void main(String[] args) {

        int[] a = {1,2,6,2};
        System.out.println(firstLast6(a));

    }
    public static boolean firstLast6(int[] nums) {

        for (int i =0; i < nums.length; i++){

            if(nums[0] == 6 || nums[nums.length -1] == 6){
                return true;
            }//if end
            else{
                return false;
            }
        }//for loop
        return true;
    }//method end
}
