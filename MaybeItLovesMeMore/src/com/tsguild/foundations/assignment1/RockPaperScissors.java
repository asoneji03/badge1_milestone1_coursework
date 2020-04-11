package com.tsguild.foundations.assignment1;

import java.util.Scanner;
import  java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("How many rounds would you like to play?");
//        String userAnswer = inputReader.nextLine();
//        int roundsToPlay = Integer.parseInt(userAnswer);
        int roundsToPlay = Integer.parseInt(inputReader.nextLine());
        if (roundsToPlay <= 10) {
            playGame(roundsToPlay);
        } else {
            System.out.println("Program is terminated.");
        }

    }

    public static int playGame(int totalRounds) {
        Scanner inputReader = new Scanner(System.in);


        int rock = 1;
        int paper = 2;
        int scissors = 3;

        int userWin = 0;
        int computerWin = 0;
        int tie = 0;

//        String userInput = inputReader.nextLine();
//        int userChoice = Integer.parseInt(inputReader.nextLine());
//        int userChoice = Integer.parseInt(inputReader.nextLine);
        int computerChoice = 0;

        for (int i = 0; i < totalRounds; i++) {
            System.out.println("Please choose 1 for Rock, 2 for Paper and 3 for scissors.");
            int userChoice = Integer.parseInt(inputReader.nextLine());
            computerChoice = ThreadLocalRandom.current().nextInt(1, 4);
            if (userChoice == 1 && computerChoice == 2) {
                computerWin++;
            } else if (userChoice == 2 && computerChoice == 1) {
                userWin++;
            } else if (userChoice == 1 && computerChoice == 3) {
                userWin++;
            } else if (userChoice == 3 && computerChoice == 1) {
                computerWin++;
            } else if (userChoice == 2 && computerChoice == 3) {
                computerWin++;
            } else if (userChoice == 3 && computerChoice == 2) {
                userWin++;
            } else {
                tie++;
            }
            System.out.println(computerChoice);
        }
        if (userWin > computerWin) {
            System.out.println("You Win");
        } else if (userWin == computerWin) {
            System.out.println("Tie");
        } else {
            System.out.println("Computer Wins");
        }
        return userWin;


    }
}

