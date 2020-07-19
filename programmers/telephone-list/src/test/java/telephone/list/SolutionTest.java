package telephone.list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testcase1(){
        test(new String[]{"119", "97674223", "1195524421"}, false);
        test(new String[]{"119", "119", "1195524421"}, false);
        test(new String[]{"119", "119", "97674223"}, true);
        test(new String[]{"123","456","789"}, true);
        test(new String[]{"12","123","1235","567","88"}, false);

    }

    private void test(String[] input, boolean answer){
        Solution sol = new Solution();
        boolean result = sol.solution(input);
        assertEquals(answer, result);
    }
}