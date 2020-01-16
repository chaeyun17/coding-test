import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * SolutionTest
 */
public class SolutionTest {

   @Test
   public void solutionTest(){
       numTest(1, new int[]{0});
       numTest(2, new int[]{0,0,1});
       numTest(3, new int[]{0,0,1,0,0,1,1});
   }

   public void numTest(int n, int[] expected){
        Solution solution = new Solution();
        int[] result = solution.solution(n);
        assertTrue(Arrays.equals(result, expected)); 
   }

}