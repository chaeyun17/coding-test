package kangaroo;

public class Solution {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		int x1Pos = x1;
		int x2Pos = x2;

		for(int i=0; i<=10000; i++){
			if(x1Pos == x2Pos){
				return "YES";
			}
			x1Pos = x1Pos + v1;
			x2Pos = x2Pos + v2;
		}
		return "NO";
	}

}
