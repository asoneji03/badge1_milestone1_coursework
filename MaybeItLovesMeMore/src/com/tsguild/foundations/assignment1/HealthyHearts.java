package com.tsguild.foundations.assignment1;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("What is your age?");
        int userAge = inputReader.nextInt();
        int maxHeartRate = 220 - userAge;
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute.");
        int rangeStart = (int) (Math.round((.5)* maxHeartRate));
        int rangeEnd = (int) (Math.round((.85) * maxHeartRate));

        System.out.println("Your target HR Zone is " + rangeStart + " - " + rangeEnd + " beats per minute.");

    }
}
