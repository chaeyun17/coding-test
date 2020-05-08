package grading.students;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    private final static int MULTIPLE_NUMBER = 5;
    private final static int FAILING_GRADE = 40;

	public static List<Integer> gradingStudents(List<Integer> input) {
        return input.stream().map(Solution::grading).collect(Collectors.toList());
    }

    private static int grading(int grade){
        if(isShouldRound(grade))
            return roundGrade(grade);
        return grade;
    }

    private static boolean isShouldRound(int grade){
        int remain = grade%MULTIPLE_NUMBER;
        int diffRoundedGrade = MULTIPLE_NUMBER - remain;
        int roundedGrade = roundGrade(grade);

        return (diffRoundedGrade < 3) && (roundedGrade >= FAILING_GRADE);
    }

    private static int roundGrade(int grade){
        int share = grade/MULTIPLE_NUMBER;
        return (share+1)*MULTIPLE_NUMBER;
    }

}
