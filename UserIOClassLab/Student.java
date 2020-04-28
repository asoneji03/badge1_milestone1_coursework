package UserIOClassLab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;
    private ArrayList<Double> quizScores;

    public Student(String name, ArrayList<Double>quizScores){
        this.name = name;
        this.quizScores = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getQuizScores() {
        return quizScores;
    }

    public void setQuizScores(ArrayList<Double> quizScores) {
        this.quizScores = quizScores;
    }
}

