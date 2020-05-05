import java.util.*;

public class Dp11052{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    int[] memory = new int[1001];
    int[] cards = new int[1001];
    for(int i=1; i<=cnt; i++){
      cards[i] = sc.nextInt();
    }

    for(int i=1; i<=cnt; i++){
      int result = 0;
      int max = 0;
      for(int j=1; j<=cnt; j++){
          if(cnt-j < 0) break;
          int temp = memory[cnt-j] + cards[j];
          if(temp > max) max = temp;  
      }
    }
    

  }
}