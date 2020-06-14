package arrays.ds;

public class Solution {

    // Complete the reverseArray function below.
    public static int[] reverseArray(int[] a) {
        int[] result = new int[a.length];
        for(int i=0; i<a.length; i++){
            result[a.length-1-i] = a[i];
        }
        return result;
    }   

    
}