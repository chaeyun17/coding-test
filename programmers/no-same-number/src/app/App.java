package app;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World");
		App app = new App();
		System.out.println(app.solution(new int[] {1,1,3,3,0,1,1}));
	}
	
    public int[] solution(int []arr) {
        int temp = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
        	if(i == 0) {
        		temp = arr[i];
        		continue;
        	}
        	if(temp == arr[i]) {
        		continue;
        	}
        	list.add(temp);
        	temp = arr[i];
        	
        }
        list.add(temp);
        
        int[] result = new int[list.size()];
        for(int i=0; i<result.length; i++) {
        	result[i] = list.get(i);
        }

        return result;
    }

}
