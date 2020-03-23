package programmers.remind.sort;

import java.util.Arrays;

public class Level1 {
    public static void main(String[] args){
        for(int answer : solution(new int[] {1,5,2,6,3,7,4},new int[][] {{2,5,3},{4,4,1},{1,7,3}}))
            System.out.println(answer); //return 5,6,3
    }
    public static int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int[] pot = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);
            Arrays.sort(pot);
            answer[i]=pot[commands[i][2]-1];
        }
        return answer;
    }
}
