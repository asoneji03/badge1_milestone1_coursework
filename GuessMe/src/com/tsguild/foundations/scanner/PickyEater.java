package com.tsguild.foundations.scanner;

import java.util.Scanner;

public class PickyEater {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("How many times has it been fried? (#) ");
        int timesFried = userInput.nextInt();

        System.out.println("Does it have any spinach in it? (y/n) ");
        String hasSpinach = userInput.next();

        System.out.println("Is it covered in cheese? (y/n) ");
        String cheeseCovered = userInput.next();

        System.out.println("How many pats of butter are on top? (#) ");
        int butterPats = userInput.nextInt();

        System.out.println("Is it covered in chocolate? (y/n)");
        String chocolatedCovered = userInput.next();

        System.out.println("Does it have a funny name? (y/n) ");
        String funnyName = userInput.next();

        System.out.println("Is it broccoli? (y/n) ");
        String isBroccoli = userInput.next();

        if (hasSpinach.equals("y") || funnyName.equals("y")) {
            System.out.println("There's no way that'll get eaten.");
        }
        if (timesFried > 2 && timesFried < 4 && chocolatedCovered.equals("y")) {
            System.out.println("Oh, it's like a deep-fried Snickers. That'll be a hit!");
        }
        if (timesFried == 2 && cheeseCovered.equals("y")) {
            System.out.println("Mmm. Yeah, fried cheesy doodles will get et.");
        }
        if (isBroccoli.equals("y") && butterPats > 6 && cheeseCovered.equals("y")) {
            System.out.println("As long as the green is hidden by cheddar, it'll happen!");
        } else if (isBroccoli.equals("y")) {
            System.out.println("Oh, green stuff like that might as well go in the bin.");

        }

    }
}
