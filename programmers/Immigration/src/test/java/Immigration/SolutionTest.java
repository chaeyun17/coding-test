package Immigration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testcase(){
        Solution sol = new Solution();
        assertEquals(28, sol.solution(6, new int[]{7, 10}));
    }
}