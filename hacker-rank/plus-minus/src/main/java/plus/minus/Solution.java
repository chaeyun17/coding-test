package plus.minus;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    static double[] plusMinus(int[] arr){
        final int DECIMAL_PLACE = 6;
        final double size = Double.valueOf(arr.length);
        double[] fractions = new double[3];

        fractions[0] = Arrays.stream(arr)
                            .filter(value->value > 0)
                            .boxed()
                            .collect(Collectors.counting())/size;
        fractions[1] = Arrays.stream(arr)
                            .filter(value->value < 0)
                            .boxed()
                            .collect(Collectors.counting())/size;
        fractions[2] = Arrays.stream(arr)
                            .filter(value->value == 0)
                            .boxed()
                            .collect(Collectors.counting())/size;

        return Arrays.stream(fractions)
                        .map(value->Solution.round(value, DECIMAL_PLACE))
                        .toArray();
    }

    static void print(double[] arr){
        for(double value : arr){
            System.out.printf("%.6f\n", value);
        }
    }

    static double round(double floatingNumber, int decimalPlace){
        double decimalNum = 1D;
        for(int i=0; i<decimalPlace; i++){
            decimalNum *= 10D;
        }
        return Math.round(floatingNumber*decimalNum)/decimalNum;
    }
}