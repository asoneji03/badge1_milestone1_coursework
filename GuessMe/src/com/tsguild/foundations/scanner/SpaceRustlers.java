package com.tsguild.foundations.scanner;

public class SpaceRustlers {

    public static void main(String[] args) {
        int spaceships = 100;
        int aliens = 125;
        int cows = 8;

        if(aliens > spaceships) {
            System.out.println("Vroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        if(cows == spaceships) {
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
            } else if (cows > spaceships){
            System.out.println("Dangit! I don't know how we're going to fit all these cows in here!");
            } else {
                System.out.println("Too many ships! Not enough cows.");
        }

    }

}
