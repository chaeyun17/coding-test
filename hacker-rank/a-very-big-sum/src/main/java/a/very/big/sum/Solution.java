package a.very.big.sum;

import java.util.Arrays;

public class Solution {

    static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).parallel().sum();
    }
}