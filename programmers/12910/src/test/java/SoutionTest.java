import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SoutionTest {

  @Test
  public void test1(){
    Solution sol1 = new Solution();
    int[] result = sol1.solution(new int[]{5, 9, 7, 10}, 5);
    assertArrayEquals(new int[]{5, 10}, result);
  }
  
}
