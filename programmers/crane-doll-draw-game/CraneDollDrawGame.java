import java.util.Stack;

public class CraneDollDrawGame {

    public static void main(String[] args){
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int result = new CraneDollDrawGame().solution(board, moves);
        System.out.println(result);
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<moves.length; i++){
            int move = moves[i]-1;
            int pickedDoll = -1;
            for(int j=0; j<board.length; j++){
                if(board[j][move] != 0){
                    pickedDoll = board[j][move];
                    board[j][move] = 0;
                    break;
                } 
            }

            if(pickedDoll == -1) continue;
            if(stack.size() > 0){
                if(stack.peek().equals(pickedDoll)){
                    answer = answer + 2;
                    stack.pop();
                }else{
                    stack.push(pickedDoll);
                }
            }else{
                stack.push(pickedDoll);
            }
        }
        return answer;
    }


}