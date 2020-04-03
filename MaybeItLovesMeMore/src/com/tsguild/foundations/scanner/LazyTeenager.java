package com.tsguild.foundations.scanner;

public class LazyTeenager {
    public static void main(String[] args) {
        int parentSaysCleanRoom = 0;
        double chancesChildCleansRoom = 0.05;

        do {
            System.out.println("Clean your room!! " + "x" + parentSaysCleanRoom);
            parentSaysCleanRoom++;
            chancesChildCleansRoom++;

        }while (parentSaysCleanRoom <= 15) ;


            if (parentSaysCleanRoom > 15) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
//               break;
            }
        }



    }





