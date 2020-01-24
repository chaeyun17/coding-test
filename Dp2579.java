import java.util.*;

/**
 * 계단 오르기
 * 풀이: 도착지인 맨 마지막 계단에서 시작해서, 출발지인 지상으로 내려오면서 점수를 계산한다.
 * 
 */
public class Dp2579{

  public static int[] stairs;

  // 메모리에는 몇번째 계단과 연속된 누적 계단 이동횟수를 key 값으로해서 몇번째 계단까지의 최댓값 결과를 저장한다.
  public static int[][] memory;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    stairs = new int[count+1];
    // 0번째 계단은 출발지이다.
    stairs[0] = 0;
    memory = new int[count+1][3];
    memory[0][0] = 0;
    memory[0][1] = 0;
    memory[0][2] = 0;
    for(int i=1; i<=count; i++){
      stairs[i] = sc.nextInt(); 
    }

    // 최상위 계단인 목적지에서 내려간다.
    // 한 계단 내려가기와 두 계단 내려가기 두 가지 경우가 있다.
    // 두 가지 경우 중, 큰 값을 결과로 취한다.
    int result = Math.max(Func(count-1, 2), Func(count-2, 1)) + stairs[count];

    System.out.println(result);
  }

  public static int Func(int stairNum, int seriesTotal){
    if(stairNum <= 0) return 0;
    if(memory[stairNum][seriesTotal] != 0) return memory[stairNum][seriesTotal];

    int result = 0;
    if(seriesTotal == 2){
      // 연속으로 바로 다음 계단을 오른 횟수가 3이 될 수 없다.
      // 그러므로, 횟수가 2일 때는 무조건 2 계단 씩 이동할 수 밖에 없다.
      // 이 때, 자신의 계단 점수를 더해야 한다.
      result = Func(stairNum-2, 1) + stairs[stairNum];
    }else{
      // 한 계단 이동한 결과와 두 계단 이동한 결과 중 최댓값 구하기
      // 이 때, 자신의 계단 점수를 더해야 한다.
      result = Math.max(Func(stairNum - 1, seriesTotal+1), Func(stairNum - 2, 1)) + stairs[stairNum];
    }

    memory[stairNum][seriesTotal] = result;
    return result;
  }
}