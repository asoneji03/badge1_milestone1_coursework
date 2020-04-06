package com.tsguild.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimes {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Which times table shall I recite?");
        int userPick = inputReader.nextInt();

        for(int i = 1; i <= 15; i++){
            System.out.println(i +  " * " + userPick + " is: " + (i*userPick));
        }

    }

}
