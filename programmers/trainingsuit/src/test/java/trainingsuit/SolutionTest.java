package trainingsuit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  
  @Test
  public void testcase1(){
    test(1, new int[]{1}, new int[]{1}, 1);
    test(5, new int[]{2, 4}, new int[]{1,3,5}, 5);
    test(5, new int[]{2, 4}, new int[]{3}, 4);
    test(3, new int[]{3}, new int[]{1}, 2);
    test(5, new int[]{2,4}, new int[]{2,5}, 5);
    test(5, new int[]{2,3}, new int[]{3}, 4);
    test(2, new int[]{1}, new int[]{2}, 2);
    test(5, new int[]{4,2}, new int[]{3,5}, 5);
  }

  private void test(int n, int[] lost, int[] reserve, int answer){
    int result = new Solution().solution(n, lost, reserve);
    assertEquals(answer, result);
  }
}