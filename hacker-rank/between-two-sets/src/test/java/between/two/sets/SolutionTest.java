package between.two.sets;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void test_case_1(){
        List<Integer> a = Arrays.asList(new Integer[]{2,6});
        List<Integer> b = Arrays.asList(new Integer[]{24,36});
        int answer = 2;

        int output = Solution.getTotalX(a, b);

        assertThat(output, IsEqual.equalTo(answer));
    }

    @Test
    public void test_case_2(){
        List<Integer> a = Arrays.asList(new Integer[]{2,4});
        List<Integer> b = Arrays.asList(new Integer[]{16,32,96});
        int answer = 3;

        int output = Solution.getTotalX(a, b);

        assertThat(output, IsEqual.equalTo(answer));
    }
}