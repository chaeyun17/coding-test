package breaking.the.records;

public class Solution {

	public static int[] breakingRecords(int[] scores) {
		int min = scores[0];
		int max = scores[0];

		int minChangedCnt=0;
		int maxChangedCnt=0;
		for(int i=1; i<scores.length; i++){
			if(min > scores[i]){
				minChangedCnt ++;
				min = scores[i];
			}

			if(max < scores[i]){
				maxChangedCnt ++;
				max = scores[i];
			}
		}
		return new int[]{maxChangedCnt, minChangedCnt};
	}
    
}