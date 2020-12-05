import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution{

  public static void main(String[] args){
    Solution sol = new Solution();
    String[] genres = {"classic", "pop", "classic", "classic", "pop"};
    int[] plays = {500, 600, 150, 800, 2500};
    int[] result = sol.solution(genres, plays);
    Arrays.stream(result).forEachOrdered(System.out::println);
  }


  public int[] solution(String[] genres, int[] plays) {
    HashMap<String, Integer> genresPlays = new HashMap<>();
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

            if(aGenre == bGenre){
                if(plays[a] < plays[b]){
                    list.set(aIdx,b);
                    list.set(bIdx,a);
                }else if(plays[a] == plays[b]){
                    if(a < b){
                        list.set(a,b);
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