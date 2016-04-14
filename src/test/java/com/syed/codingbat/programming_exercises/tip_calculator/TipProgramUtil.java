package com.syed.codingbat.programming_exercises.tip_calculator;

import java.util.Scanner;

/**
 * Created by syed on 2/23/16.
 */
public class TipProgramUtil {

    Scanner scan = new Scanner(System.in);
    double billAmount;
    double tipRate;

    public void bill() {
        while (!scan.hasNextDouble() || (billAmount = scan.nextDouble()) <= 0) {
            System.out.println("Please enter a numeric Value: ");
            scan.next();
            }
            billAmount = scan.nextDouble();
    }

    public void tipRatePercentage() {
        while (!scan.hasNextDouble() || (tipRate = scan.nextDouble()) < 0){
            System.out.println("Please enter a numeric Value: ");
        }
           tipRate = scan.nextDouble();
    }

    public void calculateTotal(){
        double tipAmount;
        double totalAfterTip;
        tipAmount = billAmount * (tipRate / 100);
        totalAfterTip = billAmount + tipAmount;
        System.out.println("Tip Amount is: " + tipAmount);
        System.out.println("Total after tip is: " + totalAfterTip);

    }
}
