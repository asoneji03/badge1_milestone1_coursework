package com.tsguild.foundations.basics.arrays;

public class FruitsBasket {
    public static void main(String[] args) {
        String[] fruit = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange"};

        int countOrange = 0;
        int countApple = 0;

        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i].equals("Orange")) {
                countOrange++;

            } else {
                countApple++;
            }
        }

        String[] oranges = new String[countOrange];
        String[] apples = new String[countApple];
        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i].equals("Orange")) {
                oranges[countOrange - 1] = "Orange";
                countOrange--;

            } else {
                apples[countApple - 1] = ("Apple");
                countApple--;
            }

        }


        System.out.println("Number of apples: " + apples.length + "\nNumber of oranges: " + oranges.length);

    }
}

