/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class MultistateSalesTaxCalculator {
    public static void main(String[] args) {
        System.out.println("What is the order amount? ");
        Scanner input = new Scanner(System.in);
        float amount = input.nextFloat();

        System.out.println("What state do you live in? ");
        input = new Scanner(System.in);
        String state = input.nextLine();

        System.out.println("What county do you live in? ");
        input = new Scanner(System.in);
        String county = input.nextLine();

        float tax;

        switch(state) {
            case "Wisconsin":
                switch(county) {
                    case "Eau Claire": tax = (float) 0.055;
                    break;
                    case "Dunn": tax = (float) 0.054;
                    break;
                    default: tax = (float) 0.05;
                    break;
                }
            break;
            case "Illinois": tax = (float) 0.08;
            break;
            default: tax = 0;
        }
        if (tax != 0) {
            tax *= amount;
            System.out.printf("The tax is $%.2f.\n", tax);
            amount += tax;
        }
        System.out.printf("The total is $%.2f.", amount);
    }
}
