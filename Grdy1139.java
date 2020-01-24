import java.util.*;

public class Grdy1139{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numOfPeople = sc.nextInt();
        List<Integer> people = new ArrayList<>();
        for(int i=0; i<numOfPeople; i++){
            people.add(sc.nextInt());
        }

        people.sort((a,b)->b-a);
        int result = 0;
        for(int i=0; i<numOfPeople; i++){
            result += (i+1) * people.get(i);
        }
        System.out.println(result);
    }
}