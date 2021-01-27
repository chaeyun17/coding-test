public class OrderString {

  public static void main(String[] args){
    OrderString os = new OrderString();
    System.out.println(os.solution("Zbcdefg"));
  }

  public String solution(String s) {
      String answer = "";
      char[] chars = s.toCharArray();
      // char[] newChars = char[chars.lenght];
      for(int i=chars.length-1; i>=1; i--){
        for(int j=0; j<i; j++){
          System.out.println("i: "+i + ",j: "+j);
          if(chars[j] < chars[j+1]){
            char temp = chars[j+1];
            chars[j+1] = chars[j];
            chars[j] = temp;
          }
        }
      }
      answer = new String(chars);
      return answer;
  }
}