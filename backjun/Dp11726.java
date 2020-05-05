import java.util.*;
/**
 * Dp11726
 */
public class Dp11726 {

  static private int[] memory;

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      memory = new int[n+1];
      System.out.println(Func(n) % 10007);
  }

  public static int Func(int n){
    int result = 0;
    if(n == 1) return 1;
    if(n == 2) return 2;
    if(memory[n] != 0) return memory[n];

    result = (Func(n-2)+Func(n-1))% 10007;
    memory[n] = result;
    return result;
  }
}