package com.tsguild.foundations.scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        int AIPick = 23;

        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.println("Your Guess: ");
        int userPick = inputReader.nextInt();

            if(userPick == AIPick){
                System.out.println("Wow, nice guess! That was it!");
            }
            if(userPick < AIPick){
                System.out.println("Ha, nice try - too low! I chose " + AIPick + ".");
            }
            if(userPick > AIPick){
                System.out.println("Too bad, way too high. I chose " + AIPick + ".");
            }


    }
}
