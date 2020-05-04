package mini.max.sum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOutput = System.out;

    @Before
    public void setUpStream(){
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void Given_Testcase1_Answer_When_execute_Then_True(){
        // Given
        int[] arr = {1,3,5,7,9};
        String answer = "16 24";
        // When
        Solution.miniMaxSum(arr);
        // Then
        assertEquals(answer, outputStream.toString());
    }

    @Test
    public void Given_TestCase1_Wrong_Answer_When_execute_Then_False(){
        // Given
        int[] arr = {1,3,5,7,9};
        String answer = "16 1";
        // When
        Solution.miniMaxSum(arr);
        // Then
        assertNotEquals(answer, outputStream.toString());
    }
    @Test
    public void Given_Testcase2_Answer_When_execute_Then_True(){
        // Given
        int[] arr = {1,2,3,4,5};
        String answer = "10 14";
        // When
        Solution.miniMaxSum(arr);
        // Then
        assertEquals(answer, outputStream.toString());
    }

    @Test
    public void Given_Testcase2_Wrong_Answer_When_execute_Then_False(){
        // Given
        int[] arr = {1,2,3,4,5};
        String answer = "1 1";
        // When
        Solution.miniMaxSum(arr);
        // Then
        assertNotEquals(answer, outputStream.toString());
    }

    @Test
    public void test_testcases(){
        test(new int[]{256741038,623958417,467905213,714532089,938071625}, "2063136757 2744467344");
    }

    public void test(int[] arr, String answer){
        // When
        Solution.miniMaxSum(arr);
        // Then
        assertEquals(answer, outputStream.toString());
    }

    @After
    public void resetStream(){
        System.setOut(originalOutput);
    }
}