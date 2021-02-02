package reverse.ternary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    Solution sol = new Solution();
    assertEquals(7, sol.solution(45));
  }

  @Test
  public void test2() {
    Solution sol = new Solution();
    assertEquals(229, sol.solution(125));
  }

  @Test
  public void test3() {
    Solution sol = new Solution();
    assertEquals(1, sol.solution(1));
  }

  @Test
  public void test4() {
    Solution sol = new Solution();
    assertEquals(0, sol.solution(100000000));
  }

  @Test
  public void test5() {
    Solution sol = new Solution();
    assertEquals(0, sol.solution(100000000));
  }

}
