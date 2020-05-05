package birthday.cake.candles;

import java.util.Arrays;

public class Solution {

	public static int birthdayCakeCandles(int[] arr) {
		int maxNum = Solution.getMaxNumber(arr);
		int numberOf = Solution.getTheNumberOf(arr, maxNum);
		return numberOf;
	}

	private static int getMaxNumber(int[] arr){
		return Arrays.stream(arr).boxed().reduce((a,b)->{
			if(a >= b) return a;
			return b;
		}).orElse(null);
	}

	private static int getTheNumberOf(int[] arr, int number){
		return (int)Arrays.stream(arr).boxed().filter(num->num==number).count();
	}

}
