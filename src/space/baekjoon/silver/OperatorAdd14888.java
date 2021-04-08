package space.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OperatorAdd14888 {
    private static int min = 1000000000;
    private static int max = -1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // + - X ÷
        int[] operators = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


    }
//    void dfs(int[] operators, int[] numbers,int index, int result){
//        if(index == numbers.length)
//            return ;
//
//        for(int i=0;i<4; i++){
//            if(operators[i] > 0){
//                operators[i]--;
//
//                switch(i){
//                    case 0 :
//                        dfs(operators, numbers, index+1, result+numbers[index]);
//                        break;
//                    case 1:
//                        dfs(operators, numbers, index+1, result - numbers[index]);
//                        break;
//                    case 2:
//                        dfs()
//                        break;
//                    case 3:
//                        break;
//                }
//            }
//        }
//    }
}
