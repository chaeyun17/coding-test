package diagonal.difference;

import java.util.ArrayList;
import java.util.List;

public class Result {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        List<Integer> leftToRightAry = new ArrayList<>();
        for(int row=0; row<arr.size(); row++){
            int column = row;
            int value = arr.get(row).get(column);
            leftToRightAry.add(value);
        }
        List<Integer> rightToLeftAry = new ArrayList<>();
        for(int row=0; row<arr.size(); row++){
            int column = arr.size()-1-row;
            int value = arr.get(row).get(column);
            rightToLeftAry.add(value);
        }
        int answer = Math.abs(sumOfList(leftToRightAry) - sumOfList(rightToLeftAry));
        return answer;
    }

    private static int sumOfList(List<Integer> list){
        return list.stream().reduce(0, Integer::sum);
    }

}