package two.numbers;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
	
	@Test
	public void test1() {
		Solution sol = new Solution();
		int[] result = sol.solution(new int[] {2,1,3,4,1});
		assertArrayEquals(new int[] {2,3,4,5,6,7}, result);
		
	}
	
	@Test
	public void test2() {
		Solution sol = new Solution();
		int[] result = sol.solution(new int[] {5,0,2,7});
		assertArrayEquals(new int[] {2,5,7,9,12}, result);
		
	}

}
