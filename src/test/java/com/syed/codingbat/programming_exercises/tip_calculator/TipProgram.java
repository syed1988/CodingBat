package com.syed.codingbat.programming_exercises.tip_calculator;

/**
 * Created by sayem on 2/23/16.
 */
public class TipProgram {


    public static void main(String[] args) {

        System.out.println("Welcome to Tip Calculator");
        System.out.println("");
        TipProgramUtil tipProgramUtil = new TipProgramUtil();

        System.out.println("Please enter bill amount");
        tipProgramUtil.bill();
        System.out.println("What is the tip percentage?");
        tipProgramUtil.tipRatePercentage();

        tipProgramUtil.calculateTotal();
    }

}
