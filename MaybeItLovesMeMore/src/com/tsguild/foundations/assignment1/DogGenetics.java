package com.tsguild.foundations.assignment1;

import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
    public static void main(String[] args) {
        String dogName = dogName();
        String[] dogBreeds = {"St Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        int[] percentOfDogBreed = dogBreedPercentage(dogBreeds.length);
        displayDoggieData(dogName, dogBreeds, percentOfDogBreed);
    }

    public static String dogName() {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        String userDogName = inputReader.next();
        return userDogName;
    }

    public static int[] dogBreedPercentage(int numberOfDogBreeds) {
        int[] randomPercents = new int[numberOfDogBreeds];
        Random rand = new Random();
        int remainingPercentOfDNA = 100;
        for (int i = 0; i < (numberOfDogBreeds - 1); i++) {
            randomPercents[i] = rand.nextInt(remainingPercentOfDNA);
            remainingPercentOfDNA = remainingPercentOfDNA - randomPercents[i];
            if (remainingPercentOfDNA == 0) {
                randomPercents[i] = 0;
            }
        }
        randomPercents[numberOfDogBreeds - 1] = remainingPercentOfDNA;
        return randomPercents;
    }

    public static void displayDoggieData(String dogName, String[] breed, int[] scientificDataOfDNA) {
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println();
        System.out.println(dogName + " is: ");

        for (int i = 0; i < breed.length; i++) {
            System.out.println(scientificDataOfDNA[i] + "% " + breed[i]);
        }
        System.out.println("\nWow that is QUITE the dog!");
    }
}