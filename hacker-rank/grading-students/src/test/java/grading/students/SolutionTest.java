package grading.students;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test_case_1(){
        List<Integer> input = Arrays.asList(new Integer[]{73,67,38,33});
        List<Integer> answer = Arrays.asList(new Integer[]{75,67,40,33});

        List<Integer> output = Solution.gradingStudents(input);
        
        assertThat(output, equalTo(answer));

    }

    @Test
    public void test_case_2(){
        List<Integer> input = Arrays.asList(new Integer[]{37,38});
        List<Integer> answer = Arrays.asList(new Integer[]{37,40});

        List<Integer> output = Solution.gradingStudents(input);
        
        assertThat(output, equalTo(answer));
    }
}