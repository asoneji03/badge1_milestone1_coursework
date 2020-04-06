package com.tsguild.foundations.methods;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BarelyControlledChaos {
    public static void main(String[] args) {


         String color = colorValue(); // call color method here
        String animal = animalValue(); // call animal method again here
        String colorAgain = colorValue(); // call color method again here
        int weight = weightValue(); // call number method,
        // with a range between 5 - 200
        int distance = weightValue(); // call number method,
        // with a range between 10 - 20
        int number = weightValue(); // call number method,
        // with a range between 10000 - 20000
        int time = weightValue(); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

      public static String colorValue(){
        String[] color = {"red", "blue", "green", "yellow", "pink"};
        Random rand = new Random();
        String color_rand = color[rand.nextInt(color.length)];
        return color_rand;
      }
    public static String animalValue(){
        String[] animal = {"cheetah", "tiger", "lioness", "elephant", "hyena"};
        Random rand = new Random();
        String animal_rand = animal[rand.nextInt(animal.length)];
        return animal_rand;
    }
    public static int weightValue() {
        int randomInteger = ThreadLocalRandom.current().nextInt(3, 200);
        return randomInteger;
    }

}


