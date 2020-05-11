package between.two.sets;

import java.util.List;
import java.util.stream.IntStream;

public class Solution {

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int min = a.stream().max(Integer::compare).get();
		int max = b.stream().min(Integer::compare).get();

		return (int) IntStream.rangeClosed(min, max)
								.filter(number -> isArrayFactorOfNumber(number, a))
								.filter(number -> isNumberFactorOfArray(number, b))
								.count();
		
	}
	
	public static boolean isArrayFactorOfNumber(int number, List<Integer> array){
		return array.stream().allMatch(ele->number%ele==0);
	}

	public static boolean isNumberFactorOfArray(int number, List<Integer> array){
		return array.stream().allMatch(ele->ele%number==0);
	}

}
