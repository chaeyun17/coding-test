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
      memory[1] = 1;
      memory[2] = 2;
      int result = Func(n) % 10007;
      System.out.println(result);
  }

  public static int Func(int n){
    int result = 0;
    if(n == 1) return 1;
    if(n == 2) return 2;
    if(memory[n] != 0) return memory[n];

    for(int i=1; i<=n/2; i++){
      result += Func(n-i);
    }

    memory[n] = result;
    return result;
  }
}