import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class MoreSpicy {

  public static void main(String[] args){
    MoreSpicy app = new MoreSpicy();
    System.out.println(app.solution(new int[]{1, 2, 3, 9, 10, 12}, 7) == 2);
    System.out.println(app.solution(new int[]{1, 2, 3, 9, 10, 12}, 3) == 1);
    System.out.println(app.solution(new int[]{1, 2, 3, 9, 10, 12}, 10000000) == -1); 
    System.out.println(app.solution(new int[]{1, 2, 3, 9, 10, 12}, 0) == 0);
    System.out.println(app.solution(new int[]{1, 2, 3, 9, 10, 12}, 2) == 1);
    // 경계값 한 원소
    System.out.println(app.solution(new int[]{101}, 100) == 0);
    System.out.println(app.solution(new int[]{100}, 100) == 0);
    System.out.println(app.solution(new int[]{100}, 101) == -1);
    // 경계값 0 원소
    System.out.println(app.solution(new int[]{0}, 0) == 0);
    System.out.println(app.solution(new int[]{0, 0, 0}, 1) == -1);
    // 비정렬
    System.out.println(app.solution(new int[]{12, 10, 9, 3, 2, 1}, 7) == 2);
    System.out.println(app.solution(new int[]{12, 10, 1, 3, 2, 9}, 7) == 2);
    // 중복
    System.out.println(app.solution(new int[]{2, 2, 2}, 2));

  }

  public int solution(int[] scoville, int K){

    PriorityQueue<Integer> queueAsc = new PriorityQueue<>(Comparator.naturalOrder());
    queueAsc.addAll(Arrays.stream(scoville).boxed().collect(Collectors.toList()));

    int count = 0;
    
    while(true){
      // 스코빌 K 미만인 것들이 하나도 없을 때...
      if(queueAsc.peek() >= K){
        return count;
      }

      if(queueAsc.size() <= 1){
        return -1;
      }

      int cook = queueAsc.poll() + (queueAsc.poll() * 2);
      queueAsc.add(cook);
      count ++;
    }

  }
  // public int solution(int[] scoville, int K){

  //   TreeSet<Integer> descTree = new TreeSet<>(Comparator.reverseOrder());
  //   descTree.addAll(Arrays.stream(scoville).boxed().collect(Collectors.toList()));

  //   int count = 0;
    
  //   while(true){
  //     if(descTree.tailSet(K, false).size() == 0){
  //       return count;
  //     }

  //     if(descTree.size() <= 1){
  //       return -1;
  //     }

  //     int cook = descTree.pollLast() + (descTree.pollLast() * 2);
  //     descTree.add(cook);
  //     count ++;
  //   }

  // }
}