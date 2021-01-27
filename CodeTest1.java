public class CodeTest1{
  
  public static void main(String[] args){
    One[] list1 = new One[10];
    One[] list2 = null;
    One one = null;
    for(int i=1; i<list1.length; i++) {
            one = new One();
            one.setKey("key"+i);
            one.setValue("value"+i);
            list1[i-1] = one;
    }
    list2 = new One[list1.length-1];
    int k=0;
    for(int j=list2.length; j>0;j--) {
      list2[j-1] = list1[k];
      k++;
    }

    list2[0].setValue("value");

    System.out.println("list1 index 0 key = "+list1[0].getKey());
    System.out.println("list1 index 0 value = "+list1[0].getValue());
    System.out.println("list2 index 0 key = "+list2[0].getKey());
    System.out.println("list2 index 0 value = "+list2[0].getValue());
    System.out.println("list1 index 8 key = "+list1[8].getKey());
    System.out.println("list1 index 8 value = "+list1[8].getValue());               
    System.out.println("list2 index 8 key = "+list2[8].getKey());
    System.out.println("list2 index 8 value = "+list2[8].getValue());

  }


}

class One {
  private String key;
  private String value;
  public String getKey() {
          return key;
  }
  public void setKey(String key) {
          this.key = key;
  }
  public String getValue() {
          return value;
  }
  public void setValue(String value) {
          this.value = value;
  }
}
