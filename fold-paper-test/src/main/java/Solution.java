import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
public class Solution {
    // n은 1이상 20 이하
    // private Map<Integer, int[]> mem = new HashMap<>(); 
    private List<int[]> mem2 = new ArrayList();

    public int[] solution(int n){
        mem2.add(0, new int[0]);
        mem2.add(1, new int[]{0});
        if(n==1) return mem2.get(1);
        for(int i=2; i<=n; i++){
            int length = (int)Math.pow(2, n)-1;
            int[] result = new int[length];
            int[] pre = mem2.get(i-1);
            int preIdx = 0;
            int putNum = 0;
            for(int t=1; t<result.length; t=t+2){
                if(preIdx >= pre.length) break;
                result[t] = pre[preIdx];
                preIdx = preIdx + 1;
            }

            for(int k=0; k<result.length; k=k+2){
                result[k] = putNum;
                putNum = (putNum==0)? 1 : 0;
            }
            mem2.add(result);
        }
        return mem2.get(n);
    }
}