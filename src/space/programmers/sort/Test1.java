package space.programmers.sort;

import java.util.Arrays;

/*
    작성자 : 채우주
    작성일자 : 2019-11-06
    문제 : K번째 수
    array 가 주어지고 commands[[i,j,k],[i,j,k],[i,j,k]...n개] 가 주어진다.
    i는 array에서 첫번째로 자를 인덱스
    j는 array의 마지막번째 인덱스

    i,j로 자른 것으로 배열을 만든 후 오름차순으로 정렬하여
    k번째 숫자들을 배열로 만들어 리턴한다.
    여기서 i와 j는 0번이아닌 1번인덱스부터 시작한다.

 */

// 일단 머릿속에서 나온 해결 순서
// commands 의 갯수만큼 반복
//        여기서 commands의 index는 0부터가아닌 1부터 시작한다.
//
//        commands{첫번째로 끊을위치 A,마지막끊을위치 B,정렬 후 몇번째의 수를 뽑을 수의 인덱스 C}
//        1.일단 A와 B 사이 자르기
//        2.오름차순정렬
//        3.C 뽑아서 answer 배열에 넣기
//

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
//            } 처음에 copyOfRange의 인덱스 계산을 잘못해서 이부분을 넣게 되었지만 사실 필요가 없었다..

            //Arrays의 copyOfRange 는 (원본배열,포함되는 시작인덱스,포함이되지않는 마지막인덱스)
            // commands 에서 주어지는 인덱스가 0에서 시작하는 인덱스가 아니므로 주의해야한다.

            int[] temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }

}
