package apple.and.orange;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test_case_1(){
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int m = 3;
        int n = 2;
        int[] apples = {-2,2,1};
        int[] oranges = {5,-6};
        List<Integer> answer = Arrays.asList(new Integer[]{1,1});

        List<Integer> output = Solution.countApplesAndOranges(s,t,a,b, apples, oranges);
        
        assertThat(output, IsEqual.equalTo(answer));

    }
}