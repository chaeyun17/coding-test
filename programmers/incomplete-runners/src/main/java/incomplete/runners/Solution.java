package incomplete.runners;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion){
        Map<String, Integer> map = new HashMap<>();
        for(String person : participant){
            if(map.containsKey(person)){
                map.put(person, map.get(person)+1);
            }else{
                map.put(person, 1);
            }
        }

        for(String completedRunner : completion){
            if(map.containsKey(completedRunner)){
               map.put(completedRunner, map.get(completedRunner)-1);
            }else{
                return completedRunner;
            }
        }

        for(String person : map.keySet()){
            if(map.get(person) == 1) return person;
        }
        
        return "";
    }
}