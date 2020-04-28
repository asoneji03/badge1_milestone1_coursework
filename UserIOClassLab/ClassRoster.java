package UserIOClassLab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ClassRoster {

    private HashMap<String, ArrayList<Double>> class1;

    public ClassRoster() {
        this.class1 = new HashMap<>();
    }

    public HashMap<String, ArrayList<Double>> getClass1() {
        return class1;
    }

    public void setClass1(HashMap<String, ArrayList<Double>> class1) {
        this.class1 = class1;
    }

    public void addStudentToRoster(Student studentNext) {
        this.class1.put(studentNext.getName(), studentNext.getQuizScores());
    }

    public void viewRoster() {
        Set<String> keys = class1.keySet();
        for (String studentNextName : keys) {
            System.out.println();
        }
    }

//    public void removeStudentFromRoster(Student studentNext){
//
//         class1.remove(addStudentToRoster(Student studentNext);
//        }


}








