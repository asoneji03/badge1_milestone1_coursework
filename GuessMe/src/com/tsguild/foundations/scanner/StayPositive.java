package com.tsguild.foundations.scanner;

import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("What number should I count down from?");
        int userPick = inputReader.nextInt();

        while (userPick> 0) {
            System.out.println(userPick--);
    }

    }
}
