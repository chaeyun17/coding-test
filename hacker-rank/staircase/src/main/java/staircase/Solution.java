package staircase;

public class Solution {
    public static void staircase(int n){
        for(int row=1; row<=n; row++){
            for(int spaceIdx=n-row; spaceIdx>0; spaceIdx--){
                System.out.printf(" ");
            }
            for(int starIdx=0; starIdx<row; starIdx++){
                System.out.printf("#");
            }
            System.out.printf("\n");
        }
    }
}