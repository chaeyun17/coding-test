package Immigration;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static Map<Integer, Long> processTimes = new HashMap<>();

    public long solution(int n, int[] times) {
        for(int i=0; i<times.length; i++){
            processTimes.put(i, Long.valueOf(times[i]));
        }


        for(int i=1; i<=n; i++){
            int minWaitLineIdx = getMinWaitLineIdx();
            processTimes.put(minWaitLineIdx, processTimes.get(minWaitLineIdx)+times[minWaitLineIdx]);
        }

        int maxWaitLineIdx = getMaxWaitLineIdx();
        return processTimes.get(maxWaitLineIdx) - times[maxWaitLineIdx];
    }

    private int getMaxWaitLineIdx() {

        int maxIdx = 0;
        for(int j=0; j<processTimes.size(); j++){
            if(processTimes.get(maxIdx) < processTimes.get(j)){
                maxIdx = j;
            }
        }
        return maxIdx;
    }

    private int getMinWaitLineIdx() {

        int minIdx = 0;
        for(int j=0; j<processTimes.size(); j++){
            if(processTimes.get(minIdx) > processTimes.get(j)){
                minIdx = j;
            }
        }
        return minIdx;
    }


}