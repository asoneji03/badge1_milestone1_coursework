package com.tsguild.foundations.scanner;

import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args){

    Scanner inputReader = new Scanner(System.in);
//    int age = 18;

    System.out.println("Hey, let's play a game! What's your name?");
    String userName = inputReader.next();

    System.out.println("Ok, " + userName + ", when were you born?");
    int userBirthYear = inputReader.nextInt();
        if(userBirthYear < 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out half a decade ago?");
        }
        if(userBirthYear < 1995) {
            System.out.println("And that the first Harry Potter came out over 15 years ago!");

        }
        if(userBirthYear < 1985) {
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
        }
        if(userBirthYear < 1975) {
            System.out.println("The original Jurassic Park release is closer to the date of the first lunar landing than it is today.");
        }
        if(userBirthYear < 1965) {
            System.out.println("Additionally, if you want to feel REALLY old, MASH the TV series has been around for almost half a century");
        }


    }

}
