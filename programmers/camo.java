import java.util.*;
import java.util.stream.*;

public class camo{

  public static void main(String[] args){
    Solution sol = new Solution();
    String[][] clothes = {{"yellow_hat","headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
    System.out.println(sol.solution(clothes)); 
  }
}

class Solution {
  public int solution(String[][] clothes) {
      Map<String, Integer> map = new HashMap<>();
      for(int i=0; i<clothes.length; i++){
        String type = clothes[i][1];
        if(map.containsKey(type)){
          map.put(type, map.get(type)+1);
        }else{
          map.put(type, 1);
        }
      }

      List<String> types = map.keySet().stream().collect(Collectors.toList());
      int total = 0;
      for(int i=0; i<types.size(); i++){
        int prev = 1;
        for(int j=i; j<types.size(); j++){
          prev = prev * map.get(types.get(j));
          total += prev;
        }
      }
      return total;
  }
}