package two.numbers;

import java.util.TreeSet;

public class Solution {

    public int[] solution(int[] numbers) {
        int[] answer = {};
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        for(int i=0; i<numbers.length; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		int sum = numbers[i]+numbers[j];
        		treeSet.add(sum);
        	}
        }
        
        int k=0;
        answer = new int[treeSet.size()];
        for(Integer ele : treeSet) {
        	answer[k] = ele;
        	k++;
        }
        
        return answer;
    }

}
