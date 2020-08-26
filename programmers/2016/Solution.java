public class Solution{

  public static void main(String[] args){
    System.out.println(new Solution().solution(5, 24));
    System.out.println(new Solution().solution(1, 3));
    System.out.println(new Solution().solution(1, 7));
    System.out.println(new Solution().solution(1, 8));
    System.out.println(new Solution().solution(12, 31));
  }

  public String solution(int a, int b) {
    String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    int[] daysOfMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
    int days = 0;

    if(a == 1){
      days = b;
    }else{
      for(int i=0; i<=a-2; i++){
        days += daysOfMonth[i];
      }
      days += b;
    }
    int dayOfWeekIdx = (days-1)%7;
    return daysOfWeek[dayOfWeekIdx];
  }
}