package incomplete.runners;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testcase1(){
        assertEquals("leo", new Solution().solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        assertEquals("vinko", new Solution().solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        assertEquals("mislav", new Solution().solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
    
}