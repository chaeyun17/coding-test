import java.util.*;
import java.util.stream.Collectors;

public class GiveUpMath{
    public static void main(String[] args){
        int[] answers = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};
        int[] answers3 = {1,2,3};
        int[] answers4 = {5,4,3,2,1,5,4,3};
        int[] answers5 = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3};
        int[] answers6 = {1,1,1,4,2,2};
        int[] result1 = new GiveUpMath().solution(answers);
        int[] result2 = new GiveUpMath().solution(answers2);
        int[] result3 = new GiveUpMath().solution(answers3);
        int[] result4 = new GiveUpMath().solution(answers4);
        int[] result5 = new GiveUpMath().solution(answers5);
        int[] result6 = new GiveUpMath().solution(answers6);

        Arrays.stream(result1).forEach(System.out::println);
        System.out.println("-------");
        Arrays.stream(result2).forEach(System.out::println);
        System.out.println("-------");
        Arrays.stream(result3).forEach(System.out::println);
        System.out.println("-------");
        Arrays.stream(result4).forEach(System.out::println);
        System.out.println("-------");
        Arrays.stream(result5).forEach(System.out::println);
        System.out.println("-------");
        Arrays.stream(result6).forEach(System.out::println);
    }   
    
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[][] studentsPattern = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // 답안지 구하기
        // 1번 수포자 답안지 구하기
        int number1 = (answers.length/studentsPattern[0].length)+1;
        List<Integer> oneAnswers = new ArrayList<>();
        for(int i=0; i<number1; i++){
            for(int j=0; j<studentsPattern[0].length; j++){
                oneAnswers.add(studentsPattern[0][j]);
            }
        }
        int number2 = (answers.length/studentsPattern[1].length)+1;
        List<Integer> twoAnswers = new ArrayList<>();
        for(int i=0; i<number2; i++){
            for(int j=0; j<studentsPattern[1].length; j++){
                twoAnswers.add(studentsPattern[1][j]);
            }
        }
        int number3 = (answers.length/studentsPattern[2].length)+1;
        List<Integer> threeAnswers = new ArrayList<>();
        for(int i=0; i<number3; i++){
            for(int j=0; j<studentsPattern[2].length; j++){
                threeAnswers.add(studentsPattern[2][j]);
            }
        }

        // 정답지와 비교하기
        // 1번 수포자 답안지와 정답지 비교해서 맞은 문항수 구하기
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == oneAnswers.get(i)){
                score1 ++;
            }
            if(answers[i] == twoAnswers.get(i)){
                score2 ++;
            }
            if(answers[i] == threeAnswers.get(i)){
                score3 ++;
            }
        }
        Map<Integer, Integer> studentsScore = new HashMap<>();
        studentsScore.put(1, score1);
        studentsScore.put(2, score2);
        studentsScore.put(3, score3);

        // 학생 점수 별로 내림차순 정렬하기
        List<Integer> ranking = new ArrayList<>();
        ranking.add(1);
        ranking.add(2);
        ranking.add(3);

        ranking.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                if(studentsScore.get(o2) < studentsScore.get(o1)){
                    return -1;
                }else if(studentsScore.get(o2) > studentsScore.get(o1)){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        
        // 가장 높은 점수인 학생들 구하기
        int topScore = studentsScore.get(ranking.get(0));
        List<Integer> tops = new ArrayList<>();
        for(int i=0; i<ranking.size(); i++){
            int studentNum = ranking.get(i);
            if(studentsScore.get(studentNum) == topScore){
                tops.add(studentNum);
            }
        }

        tops.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o1 - o2;
            }
        });

        // list -> int[] array
        answer = new int[tops.size()];        
        for(int i=0; i<tops.size(); i++){
            answer[i] = tops.get(i);
        }

        return answer;
    }

}