package com.tsguild.foundations.scanner;

import java.util.Scanner;

public class BewareTheKraken {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;


        while(depthDivedInFt < 36200){
            System.out.println("So far, we've swam " + depthDivedInFt + " feet");

            if(depthDivedInFt == 12000){
                System.out.println("I think I see a yellow tail!");
            }

            if (depthDivedInFt >= 16000){
                System.out.println("I think I see a clown fish!");
            }


            if(depthDivedInFt >=18000){
                System.out.println("I think I see an Angel Fish!");
                System.out.println("Do you need to stop? (y/n) ");
                String needToStop = inputReader.next();
                    if(needToStop.equals("y")){
                        System.out.println("Time to surface!");
                        break;
                    }
            }

            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }



            depthDivedInFt += 1000;
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}

