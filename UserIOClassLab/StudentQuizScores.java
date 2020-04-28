package UserIOClassLab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentQuizScores {
    public static void main(String[] args) {

        UserPrompts newPrompt = new UserPrompts();
        int teacherMenuChoice = newPrompt.readInt("Welcome to the Student Quiz Score Class Roster! What action would you like to take? 1) Add a new student 2) Remove a student from roster 3) View list of students 4) View list of quiz scores for a student 5) View average quiz scores for a student");
        String newStudentName;
        Double testScore = 0.0;
        String createNewTest;
        ArrayList<Double> currentStudentScores = new ArrayList<>();

//        teacherMenuChoice = inputReader.nextInt();
//        boolean programRun = true;
        ClassRoster classRoster = new ClassRoster();
//        while (programRun = true){
        if (teacherMenuChoice == 1) {
            newStudentName = newPrompt.readString("You have selected the option for add a new student. What is your student's name?");
            newStudentName= newPrompt.readString("?");
            createNewTest = newPrompt.readString("Would you like to enter a new test score? Please enter Yes or No");
                    if(createNewTest.equals("Yes")){
                        testScore = newPrompt.readDouble("Please enter the grade of test score");
                currentStudentScores.add(testScore);
                    }else{
                        teacherMenuChoice = newPrompt.readInt();
                    }

//            ClassRoster classRoster = new ClassRoster();
            Student newStudent = new Student(newStudentName, currentStudentScores);
            classRoster.addStudentToRoster(newStudent);
            for (Map.Entry<String, ArrayList<Double>> entry : classRoster.getClass1().entrySet()) {
                System.out.println(entry.getKey() + entry.getValue());
            }

        }else if(teacherMenuChoice ==2){
            UserPrompts io = new UserPrompts();
            io.print("You have selected the option for remove a student from the roster. Which student do you wish to remove?");


//            newRoster.viewRoster();
        }else if(teacherMenuChoice ==3){
            System.out.println("You have selected");
        }


    }
}



