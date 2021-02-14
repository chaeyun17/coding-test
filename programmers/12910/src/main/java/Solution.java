import java.util.*;

public class Solution {

  public int[] solution(int[] arr, int divisor) {
    int[] answer = {};
    List<Integer> temp = new ArrayList<>();
    for(int i=0; i<arr.length; i++){
      if(arr[i] % divisor  == 0){
        temp.add(arr[i]);
      }
    }

    if(temp.size() == 0){
      temp.add(-1);
    }

    temp.sort(Comparator.naturalOrder());
    
    answer = new int[temp.size()];
    for(int i=0; i<temp.size(); i++){
      answer[i] = temp.get(i);
    }
    
    return answer;
  }
  
}
