package com.tsguild.foundations.scanner;

import java.util.Scanner;

public class TriviaNight {
    public static void main (String [] args){

        Scanner inputReader = new Scanner(System.in);

//        boolean question1Correct = false;
//        boolean question2Correct = false;
//        boolean question3Correct = false;

        int totalCorrect = 0;

        System.out.println("It's TRIVIA NIGHT! Are you ready?!");

        System.out.println("First Question! What is the Lowest Level Programming Language? Is it 1) Source Code 2) Assembly Language 3) C# or 4) Machine Code");
        int userAnswer = inputReader.nextInt();
            if(userAnswer == 4){
                totalCorrect ++;
            }
        System.out.println("Second Question! Website Security CAPTCHA Forms Are Descended From the Work of? Is it 1) Grace Hopper 2) Alan Turing 3) Charles Babbage 4) Larry Page");
            userAnswer= inputReader.nextInt();
            if(userAnswer == 2){
                totalCorrect++;
            }

        System.out.println("Last Question! Which of these Sci-Fi Ships was Once Slated for a Full-Size Replica in Vegas? Is it 1) Serenity 2) The Battlestar Galactica 3) The USS Enterprise 4) The Millennium Falcon");
        userAnswer= inputReader.nextInt();

        if(userAnswer ==3){
                totalCorrect++;
            }

        System.out.println("Nice job - you got " + totalCorrect + " correct!");
    }
}
