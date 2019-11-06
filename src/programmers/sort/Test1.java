package programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;

/*
    작성자 : 채우주
    작성일자 : 2019-11-06

 */
public class Test1 {
    public static void main(String[] args){
        Test1 t = new Test1();

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int correct[] = {5,6,3};

//        int[] temp;
//        temp = Arrays.copyOfRange(array,0,1);
//        for(int a : temp)
//            System.out.println(a);

        for(int a : t.solution(array,commands))
            System.out.println(a);

        if(Arrays.equals(correct ,t.solution(array, commands)))
            System.out.println("정답");
        else
            System.out.println("틀림");

    }
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i =0;i<commands.length;i++) {
//            if(commands[i][0]==commands[i][1]){
//                answer[i]=array[commands[i][0]-1];
//                continue;
//            }
            //Arrays의 copyOfRange 는 (원본배열,포함되는 시작인덱스,포함이되지않는 마지막인덱스)
            // commands 에서 주어지는 인덱스가 0에서 시작하는 인덱스가 아니므로 주의해야한다.

            int[] temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }

}
