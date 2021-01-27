package calculator;

public class Addition implements Calculator{

  @Override
  public int compute(int intA, int intB) {
    return intA + intB;
  }
  
}
