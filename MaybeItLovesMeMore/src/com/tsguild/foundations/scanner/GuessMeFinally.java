package com.tsguild.foundations.scanner;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class GuessMeFinally {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int AIPick = ThreadLocalRandom.current().nextInt(-100, 100);
        System.out.println("I've chosen a number. Betcha can't guess it! " + AIPick);
        System.out.println("Your Guess: ");
        int userPick = inputReader.nextInt();

        if (AIPick == userPick) {
            System.out.println("Wow, nice guess! That was it!");
        } else {

            while (AIPick != userPick) {
                if (userPick < AIPick) {
                    System.out.println("Ha, nice try - too low! Try Again!");
                    System.out.println("Your Guess: ");
                    userPick = inputReader.nextInt();
                }

                if (userPick > AIPick) {
                    System.out.println("Too bad, way too high. Try Again!");
                    System.out.println("Your Guess: ");
                    userPick = inputReader.nextInt();
                }
            }

            if (userPick == AIPick) {
                System.out.println("Finally! It's about time you got it!");
            }

        }

    }


}

