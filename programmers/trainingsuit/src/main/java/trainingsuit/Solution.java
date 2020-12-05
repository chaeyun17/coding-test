package trainingsuit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  public int solution(int n, int[] lost, int[] reserve) {
    int answer = n-lost.length;
    List<Integer> reserveList = Arrays.stream(reserve)
                                      .boxed()
                                      .sorted()
                                      .collect(Collectors.toList());
    List<Integer> reserveList2 = Arrays.stream(reserve)
                                      .boxed()
                                      .sorted()
                                      .collect(Collectors.toList());
    List<Integer> lostList = Arrays.stream(lost).boxed().sorted().collect(Collectors.toList());
    for(int i=0; i<reserveList.size(); i++){
      if(lostList.contains(reserveList.get(i))){
        lostList.remove(lostList.indexOf(reserveList.get(i)));
        reserveList2.remove(reserveList2.indexOf(reserveList.get(i)));
        answer ++;
      }
    }
    for(int i=0; i<reserveList2.size(); i++){
      int before = reserveList2.get(i)-1;
      int after = reserveList2.get(i)+1;
      if(lostList.contains(before)){
        answer++;
        lostList.remove(lostList.indexOf(before));
        continue;
      }
      if(lostList.contains(after)){
        answer++;
        lostList.remove(lostList.indexOf(after));
        continue;
      }
    }
    return answer;
  }
  // public int solution(int n, int[] lost, int[] reserve) {
  //   int answer = 0;
  //   List<Integer> reserveList = Arrays.stream(reserve)
  //                                     .boxed()
  //                                     .sorted()
  //                                     .collect(Collectors.toList());
  //   List<Integer> lostList = Arrays.stream(lost).boxed().sorted().collect(Collectors.toList());
  //   for(int i=0; i<lostList.size(); i++){
  //     if(reserveList.contains(lostList.get(i))){
  //       reserveList.remove(reserveList.indexOf(lostList.get(i)));
  //       lostList.remove(i);
  //     }
  //   }
  //   answer = n-lostList.size();
  //   for(int i=0; i<lostList.size(); i++){
  //     int before = lostList.get(i) - 1;
  //     int after = lostList.get(i) + 1;
  //     if(reserveList.contains(before)){
  //       answer = answer + 1;
  //       reserveList.remove(reserveList.indexOf(before));
  //       continue;
  //     }
  //     if(reserveList.contains(after)){
  //       answer = answer + 1;
  //       reserveList.remove(reserveList.indexOf(after));
  //       continue;
  //     }
  //   }
  //   return answer;
  // }
}