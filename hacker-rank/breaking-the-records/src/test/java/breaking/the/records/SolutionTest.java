package breaking.the.records;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void test_case_1(){
        int[] scores = {10,5,20,20,4,5,2,25,1};
        int[] answer = {2,4};

        int[] result = Solution.breakingRecords(scores);

        assertArrayEquals(answer, result);
    }

    @Test
    public void test_case_2(){
        int[] scores = {3,4,21,36,10,28,35,5,24,42};
        int[] answer = {4,0};

        int[] result = Solution.breakingRecords(scores);

        assertArrayEquals(answer, result);
    }
}