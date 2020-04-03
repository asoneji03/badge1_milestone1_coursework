package com.tsguild.foundations.scanner;

import java.util.concurrent.ThreadLocalRandom;

public class MaybeItLovesMeMore {


    public static void main(String[] args) {
        System.out.println("Well here goes nothing...");

        int totalPetals = ThreadLocalRandom.current().nextInt(13, 89);
        System.out.println(totalPetals);


        boolean lovesMe = false;

        while (totalPetals >= 1) {

            if (totalPetals % 2 == 0) {
                lovesMe = false;
                System.out.println("It loves me");
            } else {
                lovesMe = true;
                System.out.println("It loves me NOT!");
            }
            totalPetals--;
        }

        if (lovesMe){
            System.out.println("Awwwww, bummer.");

        }if(!lovesMe) {
            System.out.println("Oh, wow! It really LOVES me!");
        }
    }
}
