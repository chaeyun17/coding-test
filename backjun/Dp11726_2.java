import java.util.*;
/**
 * Dp11726
 */
public class Dp11726_2 {

  static private int[] memory;

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      memory = new int[n+1];
      memory[1] = 1;
      memory[2] = 2;

      int result = 0;

      for(int i=3; i<=n; i++){
        memory[i] = memory[i-1]+memory[i-2];
      }
      result = memory[n];
      System.out.println(result% 10007);
  }
}