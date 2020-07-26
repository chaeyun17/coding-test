package Camouflage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test(){
        int answer = 5;
        String[][] input = new String[3][2];
        input[0] = new String[]{"yellow_hat", "headgear"};
        input[1] = new String[]{"blue_sunglasses", "eyewear"};
        input[2] = new String[]{"green_turban", "headgear"};
        testSol(input, answer);

    }

    @Test
    public void test2(){
        int answer = 3;
        String[][] input = new String[3][2];
        input[0] = new String[]{"crow_mask", "face"};
        input[1] = new String[]{"blue_sunglasses", "face"};
        input[2] = new String[]{"smoky_makeup", "face"};
        testSol(input, answer);
    }

    @Test
    public void test3(){
        int answer = 1;
        String[][] input = new String[1][2];
        input[0] = new String[]{"hat", "head"};
        testSol(input, answer);
    }

    @Test
    public void test4(){
        int answer = 2;
        String[][] input = new String[2][2];
        input[0] = new String[]{"crow_mask", "face"};
        input[1] = new String[]{"blue_sunglasses", "face"};
        testSol(input, answer);
    }

    @Test
    public void test5(){
        int answer = 1;
        String[][] input = new String[2][2];
        input[0] = new String[]{null, "pant"};
        input[1] = new String[]{"blue_sunglasses", "face"};
        testSol(input, answer);
    }

    @Test
    public void test6(){
        int answer = 35;
        String[][] input = new String[7][2];
        input[0] = new String[]{"blue_pants", "pant"};
        input[1] = new String[]{"green_pants", "pant"};
        input[2] = new String[]{"y_pants", "pant"};
        input[3] = new String[]{"blue_hat", "hat"};
        input[4] = new String[]{"red_hat", "hat"};
        input[5] = new String[]{"red_skirte", "skirt"};
        input[6] = new String[]{"green_skire", "skirt"};
        testSol(input, answer);
    }

    private void testSol(String[][] input, int answer){
        int result = new Solution().solution(input);
        assertEquals(answer, result);
    }
}