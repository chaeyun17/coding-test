package give.up.math;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(int[] answers) {
        int[][] studentsPattern = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == studentsPattern[0][i%studentsPattern[0].length]) cnt1++;
            if(answers[i] == studentsPattern[1][i%studentsPattern[1].length]) cnt2++;
            if(answers[i] == studentsPattern[2][i%studentsPattern[2].length]) cnt3++;
        }
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));
        List<Integer> topPerson = new ArrayList<>();
        if(cnt1 == max) topPerson.add(1);
        if(cnt2 == max) topPerson.add(2);
        if(cnt3 == max) topPerson.add(3);
        return topPerson.stream().sorted().mapToInt(num->num).toArray();
    }
    
}