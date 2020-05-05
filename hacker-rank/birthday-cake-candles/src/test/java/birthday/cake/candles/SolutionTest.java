package birthday.cake.candles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test(){

        int[] testcase1 = {3,2,1,3};
        isCorretAnswer(testcase1, 2);
        isWrongAnswer(testcase1, 1);

        int[] testcase2 = {4,4,1,3};
        isCorretAnswer(testcase2, 2);
        isWrongAnswer(testcase2, 1);
        
        int[] testcase3 = {1,2,3,4};
        isCorretAnswer(testcase3, 1);
        isWrongAnswer(testcase3, 2);
    }

    private void isWrongAnswer(int[] array, int answer) {
        int result = Solution.birthdayCakeCandles(array);
        assertNotEquals(result, answer);
    }

    private void isCorretAnswer(int[] array, int answer) {
        int result = Solution.birthdayCakeCandles(array);
        assertEquals(result, answer);
    }

}