package ui;

import java.util.Scanner;

public class UserIOConsoleImpl implements UserIO{
    Scanner inputReader = new Scanner(System.in);

    @Override
    public void print(String prompt) {
        System.out.println(prompt);
    }

    @Override
    public double readDouble(String prompt) {
        print(prompt);
        String input = inputReader.nextLine();
        double userChoice1 = Double.parseDouble(input);
        return userChoice1;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double userInputDoubleRange = 0;
        while(userInputDoubleRange < min || userInputDoubleRange > max){
            print(prompt);
            userInputDoubleRange = inputReader.nextDouble();
        }
        return userInputDoubleRange;
    }

    @Override
    public float readFloat(String prompt) {
        print(prompt);
        float userChoiceFloatA = inputReader.nextFloat();
        return userChoiceFloatA;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float userChoiceFloatRange = 0;
        while(userChoiceFloatRange < min || userChoiceFloatRange > max){
            print(prompt);
            userChoiceFloatRange = inputReader.nextFloat();
        }
        return userChoiceFloatRange;
    }

    @Override
    public int readInt(String prompt) {
        print(prompt);
        String input = inputReader.nextLine();
        int userChoiceInt = Integer.parseInt(input);
        return userChoiceInt;
    }

    @Override
    public int readInt(String prompt, int min, int max) {

        int userChoiceInRange = 0;
        print(prompt);
        while (userChoiceInRange < min || userChoiceInRange > max){
            String input = inputReader.nextLine();
            userChoiceInRange = Integer.parseInt(input);
        }

        return userChoiceInRange;
    }

    @Override
    public long readLong(String prompt) {
        return 0;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        return 0;
    }

    @Override
    public String readString(String prompt) {
        print(prompt);
        String userChoiceString = inputReader.nextLine();
        return userChoiceString;
    }

}
