package com.tsguild.foundations.scanner;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        int parentSaysCleanRoom = 0;
        int chancesChildCleansRoom = 5;
        boolean isRoomDirty = true;
        Random r = new Random();

        do {
            parentSaysCleanRoom++;
            if (parentSaysCleanRoom > 15) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            } else {
                System.out.println("Clean your room!! " + "x" + parentSaysCleanRoom);
            }
            int actualChance = r.nextInt(100);
            if (chancesChildCleansRoom >= actualChance) {
                isRoomDirty = false;
            } else {
                chancesChildCleansRoom += 5;
            }
        } while (isRoomDirty == true);


    }
}










