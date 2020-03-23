package space.programmers.stackandqueue;

import java.util.LinkedList;
import java.util.List;

public class Level1 {
    public static void main(String[] args){
        int[] p = {93,30,55};
        int[] s = {1,30,5};
        for(int a : solution(p,s)){
            System.out.println(a);
        }
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        int count=0;
        //리턴값은 배포개수(배열 인덱스 하나당 하루에 배포되는 개수)
        //스피드 계산

        //100-진행도 =남은 진행퍼센트 X
        //progresses + speeds >= 100 --> 일 완성
        //완성되는 반복문에서 카운트 ++ --> 며칠걸릴지
        //배열 인덱스 앞의 것의 카운트 부터 진행
        //카운트(한번 배포에 몇개가 될지)
        int[] arr = new int[progresses.length];
        List<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<progresses.length;i++){
            while((progresses[i]+speeds[i])<=100){
                count++;
                progresses[i]+=speeds[i];
            }
            queue.add(count);
            count=0;
        }
        return null;
    }
}