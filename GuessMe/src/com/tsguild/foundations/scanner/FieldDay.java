package com.tsguild.foundations.scanner;

import java.util.Scanner;

public class FieldDay {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        String nameSort1 = "Baggins";
        String nameSort2 = "Dresden";
        String nameSort3 = "Howl";
        String nameSort4 = "Potter";
        String nameSort5 = "Vimes";
        String team = "";

        System.out.println("What is your last name?");
        String userLastName = inputReader.nextLine();
//            int nameCompare = userLastName.compareTo(nameSort1);
            if(userLastName.compareTo(nameSort1) < 0){
                team = "Red Dragons";

            }else if(userLastName.compareTo(nameSort1) > 0 && userLastName.compareTo(nameSort2)<0){
                team = "Dark Wizards";

            }else if(userLastName.compareTo(nameSort2) > 0 && userLastName.compareTo(nameSort3)<0){
                team = "Moving Castles";
            }else if(userLastName.compareTo(nameSort3) > 0 && userLastName.compareTo(nameSort4)<0){
                team = "Golden Snitches";
            }else if(userLastName.compareTo(nameSort4) > 0 && userLastName.compareTo(nameSort5)<0){
                team = "Night Guards";
            }else if(userLastName.compareTo(nameSort5) > 0 ){
                team = "Black Holes";
            }

        System.out.println("Ahh! You're on team " + team + " ! Good luck in the games!");

    }
}
