import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BiggestNumber{
  public static void main(String[] args){
    BiggestNumber bn = new BiggestNumber();
    int[] numbers = {3, 30, 34, 5, 9};
    System.out.println(bn.solution(numbers));
  }

  public String solution(int[] numbers) {
    String maxStr = IntStream.of(numbers).mapToObj(num->String.valueOf(num)).reduce("", (part, ele)->part+ele);
    BigInteger max = new BigInteger(maxStr);
    for(int i=0; i<numbers.length-1; i++){
      for(int j=i; j<numbers.length; j++){
        int[] copied = Arrays.copyOf(numbers, numbers.length);
        int temp = copied[i];
        copied[i] = copied[j];
        copied[j] = temp;
        String numStr = IntStream.of(copied).mapToObj(num->String.valueOf(num)).reduce("", (part, ele)->part+ele);
        BigInteger number = new BigInteger(numStr);
        if(number.compareTo(max) == 1){
          numbers = Arrays.copyOf(copied, copied.length);
          max = number;
        }
      }
    }
    return max.toString();
  }
}