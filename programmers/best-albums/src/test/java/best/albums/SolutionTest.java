package best.albums;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testcase1(){
        int[] answer = {4, 1, 3, 0};
        String[] types = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        
        Solution sol = new Solution();
        int[] result = sol.solution(types, plays);
        
        assertArrayEquals(answer, result);
    }

    @Test
    public void testcase2(){
        int[] answer = {4, 1, 3, 0, 2};
        String[] types = {"classic", "pop", "good", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        
        Solution sol = new Solution();
        int[] result = sol.solution(types, plays);
        
        assertArrayEquals(answer, result);
    }
    
}