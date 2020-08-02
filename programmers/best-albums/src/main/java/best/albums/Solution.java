package best.albums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution{
  public int[] solution(String[] genres, int[] plays) {
    Map<String, Integer> genresPlays = new HashMap<>();
    for(int i=0; i<genres.length; i++){
        String genre = genres[i];
        if(genresPlays.containsKey(genre)){
            genresPlays.put(genre, genresPlays.get(genre)+plays[i]);
        }else{
            genresPlays.put(genre, plays[i]);
        }
    }

    List<Integer> list = new ArrayList<>();
    for(int i=0; i<genres.length; i++){
        list.add(i);
    }

    for(int i=0; i<list.size(); i++){
        for(int j=0; j<list.size()-i-1; j++){
            int aIdx = j;
            int bIdx = j+1;
            int a = list.get(aIdx);
            int b = list.get(bIdx);

            String aGenre = genres[a];
            String bGenre = genres[b];

            if(aGenre.equals(bGenre)){
                if(plays[a] < plays[b]){
                    list.set(aIdx,b);
                    list.set(bIdx,a);
                }else if(plays[a] == plays[b]){
                    if(b < a){
                        list.set(aIdx, b);
                        list.set(bIdx, a);
                    }
                }else{
                    continue;
                }
            }else{
                if(genresPlays.get(aGenre) < genresPlays.get(bGenre)){
                    list.set(aIdx,b);
                    list.set(bIdx,a);
                }
            }
        }
    }
    List<Integer> list2 = new ArrayList<>();
    HashMap<String, Integer> genresCnt = new HashMap<>();
    for(int i=0; i<list.size(); i++){
        String genre = genres[list.get(i)];
        if(genresCnt.containsKey(genre)){
            genresCnt.put(genre, genresCnt.get(genre)+1);
            if(genresCnt.get(genre) <= 2){
                list2.add(list.get(i));
            }
        }else{
            genresCnt.put(genre, 1);
            list2.add(list.get(i));
        }
    }

    int[] answer = new int[list2.size()];
    for(int i=0; i<list2.size(); i++){
        answer[i] = list2.get(i);
    }
    return answer;
  }
}