package apple.and.orange;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static List<Integer> countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		
		int numOfApplesWithRange = getNumOfFruitsInRange(s, t, a, apples);
		int numOfOrangesWithRange = getNumOfFruitsInRange(s, t, b, oranges);

		return Arrays.asList(new Integer[]{numOfApplesWithRange, numOfOrangesWithRange});
	}

	private static int getNumOfFruitsInRange(int s, int t, int treePoint, int[] fruitesDistance){
		return (int)Arrays.stream(fruitesDistance)
							.map(distance->mapToAbsoluteDistance(distance, treePoint))
							.filter(distance->isWithinRangeHouse(distance, s, t))
							.count();
	}

	private static int mapToAbsoluteDistance(int distance, int treePoint){
		return distance + treePoint;
	}

	private static boolean isWithinRangeHouse(int distance, int s, int t){
		return (distance >= s) && (distance <= t);
	}
}
