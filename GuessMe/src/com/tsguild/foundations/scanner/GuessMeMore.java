package com.tsguild.foundations.scanner;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessMeMore {

        public static void main(String[] args) {

            Scanner inputReader = new Scanner(System.in);
            int AIPick = ThreadLocalRandom.current().nextInt(-100, 100);

//            int AIPick = 23;

            System.out.println("I've chosen a number. Betcha can't guess it!");
            System.out.println("Your Guess: ");
            int userPick = inputReader.nextInt();

            while (AIPick != userPick){
                if(userPick < AIPick){
                    System.out.println("Ha, nice try - too low! Try Again!");
                    System.out.println("Your Guess: ");
                    userPick = inputReader.nextInt();
                }
                if(userPick > AIPick){
                    System.out.println("Too bad, way too high. Try Again!");
                    System.out.println("Your Guess: ");
                    userPick = inputReader.nextInt();
                }

            }



            if(userPick == AIPick){
                System.out.println("Wow, nice guess! That was it!");
            }



        }
    }


