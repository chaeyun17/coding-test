package arrays.ds;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class SolutionTest {


    @Test
    public void Test_TestCases(){
        Given_TestCase_When_execute_Then_True(new int[]{1,2,3}, new int[]{3,2,1}); 
        Given_TestCase_When_execute_Then_True(new int[]{1,4,2,3}, new int[]{3,2,4,1}); 
    }  

    public void Given_TestCase_When_execute_Then_True(int[] input, int[] expected){
        int[] result = Solution.reverseArray(input);
        assertEquals(expected.length, result.length);
        assertArrayEquals(expected, result);
    };
    
}