import java.util.*;

/**
 * 초콜릿 나누기
 */
public class Dp2163{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] mem = new int[x+1][y+1];
        mem[1][1] = 0;
        System.out.println(func(x,y,mem));
    }

    public static int func(int a, int b, int[][] mem){
        if(a==1 && b==1) return 0;
        if(mem[a][b] != 0) return mem[a][b];
        int result = -1;
        if(a == 1){
            result = func(1, 1, mem) + func(1, b-1, mem) + 1;
        }else{
            result = func(1, b,mem) + func(a-1,b,mem) + 1;
        }
        mem[a][b] = result;
        return result;
    }
}