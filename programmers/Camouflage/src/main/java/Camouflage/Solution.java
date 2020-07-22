package Camouflage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
          String type = clothes[i][1];
          String clothName = clothes[i][0];
          if(map.containsKey(type)){
            map.put(type, map.get(type)+1);
          }else{
            if(clothName == null || clothName.isEmpty()) continue;
            map.put(type, 1);
          }
        }
  
        List<String> types = map.keySet().stream().collect(Collectors.toList());
        int total = 1;
        for(int i=0; i<types.size(); i++){
            total = total * (map.get(types.get(i)) + 1);
        }
        total = total - 1;
        return total;
    }
    public int solution2(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
          String type = clothes[i][1];
          String clothName = clothes[i][0];
          if(map.containsKey(type)){
            map.put(type, map.get(type)+1);
          }else{
            if(clothName == null || clothName.isEmpty()) continue;
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