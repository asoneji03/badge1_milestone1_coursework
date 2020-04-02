package com.tsguild.foundations.scanner;

public class LovesMe {
    public static void main(String[] args) {
        System.out.println("Well here goes nothing...");
        boolean lovesMe;
        int petalsRemaining = 0;

        while (petalsRemaining < 34) {
            petalsRemaining++;

            if (petalsRemaining % 2 == 0) {
                lovesMe = true;
                System.out.println("It loves me");

            } else {
                lovesMe = false;
                System.out.println("It loves me NOT!");
            }


        }
        System.out.println("I knew it! It LOVES me!");
    }
}
