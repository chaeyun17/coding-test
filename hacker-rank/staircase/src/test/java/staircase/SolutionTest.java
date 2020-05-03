package staircase;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setupStreams(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void test_case_1(){
        // Given
        int n = 4;

        // When
        Solution.staircase(n);

        // Then
        String answer = "   #\n  ##\n ###\n####\n";
        assertEquals(answer, outContent.toString());
    }
    
    @Test
    public void test_case_2(){
        // Given
        int n = 5;

        // When
        Solution.staircase(n);

        // Then
        String answer = "    #\n   ##\n  ###\n ####\n#####\n";
        assertEquals(answer, outContent.toString());
    }

    @After
    public void restoreStreams(){
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


}