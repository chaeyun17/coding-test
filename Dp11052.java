import java.util.*;

public class Dp11052{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] cardPacks = new int[N+1];
        for(int i=1; i<=N; i++){
            cardPacks[i] = sc.nextInt();
        }

        int[] memory = new int[N+1];

        int max = 0;
        for(int i=1; i<=N; i++){
            int temp = 0;
            if(memory[i] == 0){
                temp = getMax(i, cardPacks, memory);
                memory[i] = temp;
            }else{
                temp = memory[i];
            }

            if(temp > max) max = temp;
        }
        System.out.println(max);

    }

    public static int getMax(final int num, int[] cardPacks, int[] memory){
        int max = 0;
        for(int i=1; i<=num; i++){
            int temp = memory[num-i] + cardPacks[i];
            if(temp > max) max = temp;
        }
        return max;
    }
}