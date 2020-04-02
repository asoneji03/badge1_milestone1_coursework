package com.tsguild.foundations.scanner;

import java.util.Random;


public class CoinFlipper {
    public static void main(String[] args) {

        Random coinToss = new Random();

        boolean coinResult = coinToss.nextBoolean();

        System.out.println("Ready, Set, Flip.....!");

        if(coinResult){
            System.out.println("You got HEADS!");
        }
        if(!coinResult){
            System.out.println("You got TAILS!");
        }

    }
}

