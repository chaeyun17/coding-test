package a.very.big.sum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1(){
        long[] ary = {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};
        long result = Solution.aVeryBigSum(ary);
        assertEquals(5000000015L, result);
    }
}