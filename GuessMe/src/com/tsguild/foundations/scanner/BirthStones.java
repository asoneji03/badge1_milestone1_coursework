package com.tsguild.foundations.scanner;

import java.util.Scanner;

public class BirthStones {
    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);

        String month = "";
        String birthStone = "";
        boolean isValid = false;
        int userMonth;

        do {
            System.out.println("What month's birthstone are you wanting to know?");
             userMonth = inputReader.nextInt();

            if (userMonth < 1 || userMonth > 12) {
                System.out.println("I think you must be confused," + userMonth + " doesn't match a month.");
            }else {
                isValid =true;
            }
        }while(!isValid); // same as (isValid = false)

            if (userMonth == 1) {
                month = "January";
                birthStone = "Garnet";
            } else if (userMonth == 2) {
                month = "February";
                birthStone = "Amethyst";
            } else if (userMonth == 3) {
                month = "March";
                birthStone = "Aquamarine";
            } else if (userMonth == 4) {
                month = "April";
                birthStone = "Diamond";
            } else if (userMonth == 5) {
                month = "May";
                birthStone = "Emerald";
            } else if (userMonth == 6) {
                month = "June";
                birthStone = "Pearl";
            } else if (userMonth == 7) {
                month = "July";
                birthStone = "Ruby";
            } else if (userMonth == 8) {
                month = "August";
                birthStone = "Peridot";
            } else if (userMonth == 9) {
                month = "September";
                birthStone = "Sapphire";
            } else if (userMonth == 10) {
                month = "October";
                birthStone = "Opal";
            } else if (userMonth == 11) {
                month = "November";
                birthStone = "Topaz";
            } else if (userMonth == 12) {
                month = "December";
                birthStone = "Turquoise";
            }

            System.out.println(month + "'s birthstone is " + birthStone + ".");
        }
}
