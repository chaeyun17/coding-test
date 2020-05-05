import java.util.Scanner;

/**
 * ScannerEx
 */
public class ScannerEx {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);           
        int houseCnt = sc.nextInt();
        System.out.println(houseCnt);
        int[][] arr = new int[houseCnt][3];
        for(int i=0; i<arr.length; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        for(int k=0; k<arr.length; k++){
            for(int j=0; j<3; j++){
                System.out.println(arr[k][j]);
            }
        }
    }
}