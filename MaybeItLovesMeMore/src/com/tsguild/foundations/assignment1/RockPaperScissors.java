package com.tsguild.foundations.assignment1;

import java.util.Scanner;
import  java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int userWin = 0;
        int computerWin = 0;
        int tie = 0;
        String finalWinner = "";
        int computerChoice = 0;
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("How many rounds would you like to play?");
        int roundsToPlay = Integer.parseInt(inputReader.nextLine());
        int userChoice = 0;

        while ((roundsToPlay <= 10) && (roundsToPlay > 1)) {
//            String andTheWinnerIs = playGame(roundsToPlay);
            for (int i = 0; i < roundsToPlay; i++) {
                System.out.println("Please choose 1 for Rock, 2 for Paper and 3 for scissors.");
                userChoice = Integer.parseInt(inputReader.nextLine());
                while((userChoice != 1) && (userChoice != 2) && (userChoice !=3)){
                    System.out.println("This is not a valid entry please enter 1, 2, or 3.");
                    userChoice = Integer.parseInt(inputReader.nextLine());
                }
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
                System.out.println("The computer chose: " + computerChoice);
            }
            if (userWin > computerWin) {
                finalWinner = "You Win";
            } else if (userWin == computerWin) {
                finalWinner = ("Tie");
            } else {
                finalWinner = ("Computer Wins");
            }

            System.out.println("The number of rounds you won are: " + userWin + "\nThe number of rounds the computer won are: " + computerWin + "\nThe number of rounds which tied were: " + tie + "\nThe final result of the game is: " + finalWinner);
            System.out.println("Would you like to play again? (Enter Yes or No)");
            String playAgain = inputReader.nextLine();
            if ((playAgain.equals("Yes")) || (playAgain.equals("yes"))) {
                System.out.println("How many rounds would you like to play?");
                roundsToPlay = Integer.parseInt(inputReader.nextLine());
            } else {
                roundsToPlay = 0;
                System.out.println("Thanks for playing!");
            }
        }
        System.out.println("Program is terminated.");

    }
    }




//    public static String playGame(int totalRounds) {
//        Scanner inputReader = new Scanner(System.in);


//        int rock = 1;
//        int paper = 2;
//        int scissors = 3;
//        int userWin = 0;
//        int computerWin = 0;
//        int tie = 0;
//        String finalWinner = "";
//        int computerChoice = 0;
//
//        for (int i = 0; i < totalRounds; i++) {
//            System.out.println("Please choose 1 for Rock, 2 for Paper and 3 for scissors.");
//            int userChoice = Integer.parseInt(inputReader.nextLine());
//            if(userChoice>3){
//                System.out.println("This is not a valid entry please enter 1, 2, or 3.");
//                userChoice = Integer.parseInt(inputReader.nextLine());
//            }
//            computerChoice = ThreadLocalRandom.current().nextInt(1, 4);
//            if (userChoice == 1 && computerChoice == 2) {
//                computerWin++;
//            } else if (userChoice == 2 && computerChoice == 1) {
//                userWin++;
//            } else if (userChoice == 1 && computerChoice == 3) {
//                userWin++;
//            } else if (userChoice == 3 && computerChoice == 1) {
//                computerWin++;
//            } else if (userChoice == 2 && computerChoice == 3) {
//                computerWin++;
//            } else if (userChoice == 3 && computerChoice == 2) {
//                userWin++;
//            } else {
//                tie++;
//            }
//            System.out.println(computerChoice);
//        }
//        if (userWin > computerWin) {
//            finalWinner = "You Win";
//        } else if (userWin == computerWin) {
//            finalWinner = ("Tie");
//        } else {
//            finalWinner = ("Computer Wins");
//        }
//        return finalWinner;
//
//
//    }

