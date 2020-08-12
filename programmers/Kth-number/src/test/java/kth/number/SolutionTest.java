package kth.number;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testcase1(){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}}; 
        int[] result = new Solution().solution(array, commands);
        int[] expected = {5, 6, 3};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testcase2(){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}}; 
        int[] result = new Solution().solution2(array, commands);
        int[] expected = {5, 6, 3};
        assertArrayEquals(expected, result);
    }
    
}