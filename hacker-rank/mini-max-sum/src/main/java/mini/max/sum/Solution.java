package mini.max.sum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void miniMaxSum(int[] arr){
        List<Integer> sorted = Arrays.stream(arr)
                                        .sorted()
                                        .boxed()
                                        .collect(Collectors.toList());
        long min = 0;
        long max = 0;
        for(int i=0; i<sorted.size()-1; i++){
            min += sorted.get(i);
        }
        for(int i=1; i<sorted.size(); i++){
            max += sorted.get(i);
        }
        System.out.printf("%d %d",min,max);
    }
}