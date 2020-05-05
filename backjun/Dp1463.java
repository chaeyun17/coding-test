import java.util.*;

/**
 * 다이나믹 프로그래밍 1463번: 1로 만들기
 */
public class Dp1463{

    public static void main(String[] args){
        int N = 10;
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 0);
        System.out.println(func(N, memo));

    }

    public static int func(int N, Map<Integer, Integer> memo){
        
        if(N == 1) return memo.get(1);
        
        int result = 999999;


        if(N%2 == 0){
            if(memo.containsKey(N/2)){
                result = memo.get(N/2);
            }else{
                result = func(N/2, memo);
                memo.put(N/2, result);
            }
        }

        if(N%3 == 0){
            int temp = -1;
            if(memo.containsKey(N/3)){
                temp = memo.get(N/3);
            }else{
                temp = func(N/3, memo);
                memo.put(N/3, temp);
            }
            if(temp < result) result = temp;
        }
        int temp = -1;
        if(memo.containsKey(N-1)){
            temp = memo.get(N-1);
        }else{
            temp = func(N-1, memo);
            memo.put(N-1, temp);
        }
        if(temp < result) result = temp;

        return result + 1;

    }

}