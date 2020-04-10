package com.tsguild.foundations.basics.arrays;

import java.util.Scanner;
import  java.util.Arrays;


public class FruitSalad {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple", "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};


        // Code Recipe for fruit salad should go here!
        int berriesNeeded = 6;
        int applesNeeded = 3;
        int orangesNeeded = 2;
        int totalFruit = 0;
        int maxFruit = 12;
//        int[] apples = new int [getApples(fruit)];
//        int[] oranges = new int [getOranges(fruit)];
//        int[] berries = new int [getBerries(fruit)];


        System.out.println("Hello, you bout to make some salad.. \nFirst we'll pick apples :");
        String[] userFruitSelection1 = getFruit(fruit,"Apple", applesNeeded);
        //Apple
        System.out.println("These apples are being added to your salad.");
        for (int i =0; i < userFruitSelection1.length; i++) {
            System.out.println("[" + i + "] " + userFruitSelection1[i]);
        };
        System.out.println("Now we will pick oranges: ");
        String[] userFruitSelection2 = getFruit(fruit,"Orange", orangesNeeded);
        //Apple
        System.out.println("These oranges are being added to your salad.");
        for (int i =0; i < userFruitSelection2.length; i++) {
            System.out.println("[" + i + "] " + userFruitSelection2[i]);
        };
        System.out.println("Now we will pick berries: ");
        String[] userFruitSelection3 = getFruit(fruit,"berry", berriesNeeded);
        //Apple
        System.out.println("These berries are being added to your salad.");
        for (int i =0; i < userFruitSelection3.length; i++) {
            System.out.println("[" + i + "] " + userFruitSelection3[i]);
        };

        System.out.println("This is your new fruit salad: ");
        int aLen = userFruitSelection1.length;
        int bLen = userFruitSelection2.length;
        int cLen = userFruitSelection3.length;
        String [] fruitSalad = new String[aLen + bLen + cLen];
        System.arraycopy(userFruitSelection1, 0, fruitSalad,0, aLen);
        System.arraycopy(userFruitSelection2, 0, fruitSalad,aLen, bLen);
        System.arraycopy(userFruitSelection3, 0, fruitSalad,aLen+bLen, cLen);
        System.out.println(Arrays.toString(fruitSalad));



    }


    public static String[] getFruit(String[] fruit, String fruitTaFind, int numFruitToFind) {
//        int fruitCount = 0;
//        for (int i = 0; i < fruit.length; i++) {
//            if (fruit[i].contains(fruitTaFind)) {
//                fruitCount++;
//            }
//        }
        String[] currentFruitArr = new String[numFruitToFind];

        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i].contains(fruitTaFind) && numFruitToFind>0) {
                currentFruitArr[numFruitToFind-1]= fruit[i];
                numFruitToFind--;
            }
        }

        return currentFruitArr;
    }

}



