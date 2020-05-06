package time.conversion;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test_case_1(){
        String input = "07:05:45PM";
        String answer = "19:05:45";
        
        String result = Solution.timeConversion(input);

        assertThat(result, equalTo(answer));
    }

}