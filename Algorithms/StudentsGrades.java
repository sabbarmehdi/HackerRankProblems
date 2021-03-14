package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class StudentsGrades {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> finalGrades = new ArrayList<Integer>();
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 38) {
                finalGrades.add(grades.get(i));
            } else if (grades.get(i) > 37) {
                int a = grades.get(i) % 10;
                if (a <= 5 && 5 - a < 3) {
                    finalGrades.add(grades.get(i) - a + 5);
                }else if(a <= 10 && 10 - a < 3){
                    finalGrades.add(grades.get(i) - a + 10);
                }else {
                    finalGrades.add(grades.get(i));
                }
            }
        }
        return finalGrades;
    }
}
