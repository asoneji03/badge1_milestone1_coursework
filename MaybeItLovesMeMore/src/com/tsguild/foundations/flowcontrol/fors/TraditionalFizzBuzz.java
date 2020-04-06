package com.tsguild.foundations.flowcontrol.fors;
import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        System.out.println("How many units fizzing and buzzing do you need in your life?");
        int fizzCount = inputReader.nextInt();
        for (int i = 0; i <= fizzCount; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("fizz buzz");
            } else if(i % 3==0){
                System.out.println("fizz");
            }else if(i % 5 ==0){
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }

        System.out.println("TRADITION!!!!!");

    }
}

