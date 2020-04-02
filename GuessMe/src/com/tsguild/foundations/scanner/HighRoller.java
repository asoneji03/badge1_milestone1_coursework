package com.tsguild.foundations.scanner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class HighRoller {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        System.out.println("How many sides does the dice have?");
        int sidesOfDice = inputReader.nextInt();

        Random diceRoller = new Random();


        System.out.println("");
        int rollResult = diceRoller.nextInt(sidesOfDice)+1;

        System.out.println("TIME TO ROOOOOLL THE DICE!");
        System.out.println("I rolled a " +rollResult);

        if(rollResult == 1){
            System.out.println("You rolled a critical failure!");
        }else if(rollResult ==sidesOfDice){
            System.out.println("You rolled a critical! Nice Job!");
        }
    }
}
