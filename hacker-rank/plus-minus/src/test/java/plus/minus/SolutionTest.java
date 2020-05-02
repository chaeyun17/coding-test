package plus.minus;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test_case_1(){
        // Given
        int[] arr = {1, 1, 0, -1, -1};
        double[] expecteds = {0.400000, 0.400000, 0.200000};

        // When
        double[] actuals = Solution.plusMinus(arr);
        
        // Then
        assertArrayEquals(expecteds, actuals, 0);
    }

    @Test
    public void test_case_2(){
        // Given
        int[] arr = {-4, 3, -9, 0, 4, 1};
        double[] expecteds = {0.500000, 0.333333, 0.166667};

        // When
        double[] actuals = Solution.plusMinus(arr);
        
        // Then
        assertArrayEquals(expecteds, actuals, 0);
    }


}