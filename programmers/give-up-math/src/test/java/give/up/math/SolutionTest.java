package give.up.math;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void test1(){
        int[] expected = {1};
        int[] answers = {1,2,3,4,5};
        int[] result = new Solution().solution(answers);
        assertArrayEquals(expected, result);
    }
    @Test
    public void test2(){
        int[] expected = {1,2,3};
        int[] answers = {1,3,2,4,2};
        int[] result = new Solution().solution(answers);
        assertArrayEquals(expected, result);
    }
    
}