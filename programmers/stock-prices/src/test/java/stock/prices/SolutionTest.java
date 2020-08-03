package stock.prices;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test1(){
        int[] prices = {1,2,3,2,3};
        int[] answer = {4,3,1,1,0};

        int[] result = new Solution().solution(prices);

        assertArrayEquals(answer, result);
    }

    @Test
    public void test2(){
        int[] prices = {1,1,1,1,1};
        int[] answer = {4,3,2,1,0};

        int[] result = new Solution().solution(prices);

        assertArrayEquals(answer, result);
    }
    @Test
    public void test3(){
        int[] prices = {5,4,3,2,1};
        int[] answer = {1,1,1,1,0};

        int[] result = new Solution().solution(prices);

        assertArrayEquals(answer, result);
    }
}