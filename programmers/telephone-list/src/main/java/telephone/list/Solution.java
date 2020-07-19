package telephone.list;

public class Solution {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        for(int j=0; j<phone_book.length-1; j++){
            for(int k=j+1; k<phone_book.length; k++){
                boolean result = this.isHeaderString(phone_book[j], phone_book[k]);
                if(result) return false;
            }
        }
        return answer;
    }

    private boolean isHeaderString(String a, String b){
        if(a.length() == b.length()) {
            return false;
        }else if(a.length() < b.length()){
            return b.startsWith(a);
        }else{
            return a.startsWith(b);
        }
    }
    
}