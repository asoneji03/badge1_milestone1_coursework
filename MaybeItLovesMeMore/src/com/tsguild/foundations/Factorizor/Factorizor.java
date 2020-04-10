package com.tsguild.foundations.Factorizor;

import java.util.Scanner;

public class Factorizor {

    public static void main(String[] args) {
        System.out.println("What number would you like to factor? ");
        Scanner inputReader = new Scanner(System.in);

        int userFactor = inputReader.nextInt();
        int sumOfFactors = 0;


        for (int i = 1; i < userFactor; i++) {
            for (int j = 1; j <= userFactor; j++) {
                if ((i * j) == userFactor) {
                    System.out.println(i);
                    sumOfFactors += i;
                }
            }
        }
        if (sumOfFactors == userFactor) {
            System.out.println(userFactor + " is a perfect number.");
        }
        if(sumOfFactors==1){
            System.out.println(userFactor + " is a prime number.");
        }else{
            System.out.println(userFactor + " is not a prime number.");
        }
    }
}
