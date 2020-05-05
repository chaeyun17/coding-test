import java.util.*;

public class Dp11727{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] memory = new int[1001];
        memory[1] = 1;
        memory[2] = 3;

        for(int i=3; i<=N; i++){
            memory[i] = (memory[i-1] + (memory[i-2] * 2)) % 10007;
        }

        System.out.println(memory[N]);
    }
}