package com.tsguild.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TheCount {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int counter = 0;

        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU ***");
        System.out.println("Start at: " );
        int userStart = inputReader.nextInt();
        System.out.println("Stop at: ");
        int userStop = inputReader.nextInt();
        System.out.println("Count By: ");
        int userCountBy = inputReader.nextInt();

        for(int i = userStart; i < userStop;i+=userCountBy){
            System.out.print(i + (" "));
            counter++;
            if(counter % 3 == 0) System.out.print("- Ah ah ah!" + "\n");
            if(i==userStop){
                System.out.print(i);
            }
        }
    }
}
