package diagonal.difference;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ResultTest {

    @Test
    public void test(){
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(11,2,4));
        arr.add(Arrays.asList(4,5,6));
        arr.add(Arrays.asList(10,8,-12));
        
        int result = Result.diagonalDifference(arr);
        assertEquals(15, result);
    }

    @Test
    public void test2(){
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,2,3,4));
        arr.add(Arrays.asList(5,6,7,9));
        arr.add(Arrays.asList(9,10,11,12));
        arr.add(Arrays.asList(13,14,15,16));

        int result = Result.diagonalDifference(arr);
        assertEquals(0, result);

    }

}