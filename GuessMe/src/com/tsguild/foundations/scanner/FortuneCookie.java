package com.tsguild.foundations.scanner;

import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Random randomizer = new Random();

        int x =randomizer.nextInt(9);

        System.out.println("Your Greek Fortune: " + "");

        if(x ==0){
            System.out.println("Those aren't the droids you're looking for.");
        }else if(x == 1){
            System.out.println("Never go in against a Sicilian when death is on the line!");
        }else if(x == 2){
            System.out.println("Goonies never say die");
        }else if(x==3){
            System.out.println("With great power there must also come - great responsibility.");
        }else if(x==4){
            System.out.println("Never argue with the data.");
        }else if(x==5){
            System.out.println("Try not. Do, or do not. There is no try.");
        }else if(x==6){
            System.out.println("You are a leaf on the wind, watch how you soar.");
        }else if(x==7){
            System.out.println("Do absolutely nothing, and it will be everything that you thought it could be.");
        }else if(x==8){
            System.out.println("Kneel before Zod.");
        }else if(x==9){
            System.out.println("Make it so.");
        }
    }
}
