/**
 * Reverser
 */
public class Reverser {

    public static String reverse(String origin){
        String result = "";
        for(int i=0; i<origin.length(); i++){
            result += origin.substring(origin.length()-(i+1), origin.length()-i);
        }
        
        return result;
    }

    public static String reverse2(String origin){
        
        int length = origin.length();
        char[] result = new char[length];

        int beginIdx = 0;
        int endIdx = length-1;

        while(beginIdx <= endIdx){
            result[beginIdx] = origin.charAt(endIdx);
            result[endIdx] = origin.charAt(beginIdx);
            beginIdx ++;
            endIdx --;
        }
        return new String(result);
    }
}