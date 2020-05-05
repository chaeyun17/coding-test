import java.util.*;

/**
 * Dp1149: RGB 거리
 */
public class Dp1149 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);           
        int houseCnt = sc.nextInt();
        int[][] rgbCosts = new int[houseCnt][3];
        for(int i=0; i<rgbCosts.length; i++){
            rgbCosts[i][0] = sc.nextInt();
            rgbCosts[i][1] = sc.nextInt();
            rgbCosts[i][2] = sc.nextInt();
        }

        int[][] houseMem = new int[houseCnt][3];
        houseMem[0][0] = Math.min(rgbCosts[0][1], rgbCosts[0][2]);
        houseMem[0][1] = Math.min(rgbCosts[0][0], rgbCosts[0][2]);
        houseMem[0][2] = Math.min(rgbCosts[0][0], rgbCosts[0][1]);

        for(int n=1; n<=houseCnt; n++){
            getMinCost('R', rgbCosts, n, houseMem);
            getMinCost('G', rgbCosts, n, houseMem);
            getMinCost('B', rgbCosts, n, houseMem);
        }

        int result = getMinNumber(houseMem[houseCnt-1][0], houseMem[houseCnt-1][1], houseMem[houseCnt-1][2]);
        System.out.println(result); 
        
    }

    public static int getMinCost(char prevColor, int[][] rgbCosts, int houseCnt, int[][] houseMem){

        if(houseCnt == 1){
            if(prevColor == 'R'){
                return houseMem[0][0];
            }
            if(prevColor == 'G'){
                return houseMem[0][1];
            }
            if(prevColor == 'B'){
                return houseMem[0][2];
            }
            return 0;
        }

        if(prevColor == 'R'){
            if(houseMem[houseCnt-1][0] != 0) return houseMem[houseCnt-1][0];
            int temp = Math.min(getMinCost('G', rgbCosts, houseCnt-1, houseMem)+rgbCosts[houseCnt-1][1], getMinCost('B', rgbCosts, houseCnt-1, houseMem)+ rgbCosts[houseCnt-1][2]);
            houseMem[houseCnt-1][0] = temp;
            return temp;
        }else if(prevColor == 'G'){
            if(houseMem[houseCnt-1][1] != 0) return houseMem[houseCnt-1][1];
            int temp = Math.min(getMinCost('R', rgbCosts, houseCnt-1, houseMem)+rgbCosts[houseCnt-1][0], getMinCost('B', rgbCosts, houseCnt-1, houseMem)+rgbCosts[houseCnt-1][2]);
            houseMem[houseCnt-1][1] = temp;
            return temp;

        }else if(prevColor == 'B'){
            if(houseMem[houseCnt-1][2] != 0) return houseMem[houseCnt-1][2];
            int temp = Math.min(getMinCost('R', rgbCosts, houseCnt-1, houseMem)+rgbCosts[houseCnt-1][0], getMinCost('G', rgbCosts, houseCnt-1, houseMem)+rgbCosts[houseCnt-1][1]);
            houseMem[houseCnt-1][2] = temp;
            return temp;

        }else{
            return 0;
        }
    }

    public static int getMinNumber(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }
}