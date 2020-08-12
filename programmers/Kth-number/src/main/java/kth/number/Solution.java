package kth.number;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int[] command = commands[i];
            int[] part = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(part);
            int value = part[command[2]-1];
            answer[i] = value;
        }
        return answer;
    }

    public int[] solution2(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int[] command = commands[i];
            int[] part = new int[command[1] - command[0] + 1];
            for(int j=0; j<command[1]-command[0]+1; j++ ){
                part[j] = array[j+command[0]-1];
            }

            for(int j=0; j<part.length; j++){
                for(int k=0; k<part.length-j-1; k++){
                    if(part[k] > part[k+1]){
                        int temp = part[k];
                        part[k] = part[k+1];
                        part[k+1] = temp;
                    }
                }
            }
            answer[i] = part[command[2]-1];
        }
        return answer;
    }
}