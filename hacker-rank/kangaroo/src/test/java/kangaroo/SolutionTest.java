package kangaroo;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test_case_1(){
        int[] input = {0,3,4,2};
        String answer = "YES";

        String result = Solution.kangaroo(input[0], input[1], input[2], input[3]);

        assertThat(result, IsEqual.equalTo(answer));
    }

    @Test
    public void test_case_2(){
        int[] input = {0,2,5,3};
        String answer = "NO";

        String result = Solution.kangaroo(input[0], input[1], input[2], input[3]);

        assertThat(result, IsEqual.equalTo(answer));
    }
}