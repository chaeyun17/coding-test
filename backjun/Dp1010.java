import java.util.*;

public class Dp1010{

    static int[][] memory = new int[31][31];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numOfTestCase = sc.nextInt();
        int[] result = new int[numOfTestCase];
        for(int i=0; i<numOfTestCase; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            result[i] = func(N,M);
        }

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int func(int n, int m){
        int result = 0;
        if(n==1) memory[1][m] = m;
        if(memory[n][m] != 0) return memory[n][m];
        for(int i=n-1; i<=m-1; i++){
            result += func(n-1, i);
        }
        memory[n][m] = result;
        return result;
    }
}