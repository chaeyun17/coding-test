package reverse.ternary;

public class Solution {

  public int solution(int n) {
    int answer = 0;
    String reversedStr = "";
    int remain = n;
    while (remain > 0) {
      reversedStr += String.valueOf(remain % 3);
      remain = remain / 3;
    }

    reversedStr = String.valueOf(Long.parseLong(reversedStr));

    for (int i = 0; i < reversedStr.length(); i++) {
      long number = Long.parseLong("" + reversedStr.charAt(reversedStr.length() - i - 1));
      answer += number * Math.pow(3, i);
    }

    return answer;
  }
}
