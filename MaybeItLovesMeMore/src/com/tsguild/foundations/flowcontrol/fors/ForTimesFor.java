package com.tsguild.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimesFor {
    public static void main(String[] args) {
            Scanner inputReader = new Scanner(System.in);
            int totalCorrect = 0;

            System.out.println("Which times table shall I recite?");
            int userPick = inputReader.nextInt();
        for(int i = 1; i <= 15; i++){
            System.out.println(i);
            System.out.println(i +  " * " + userPick + " is: ");
            int userGuess = inputReader.nextInt();

                int actualAnswer = (i*userPick);
                if(userGuess == actualAnswer){
                    System.out.println("Correct!");
                    totalCorrect++;
                }else {
                    System.out.println("Sorry no, the answer is " + actualAnswer);
                }
            }

            System.out.println("You got " + totalCorrect + " correct.");


        }

    }


