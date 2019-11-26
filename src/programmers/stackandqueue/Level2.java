package programmers.stackandqueue;

import java.util.*;

public class Level2 {
    public static void main(String[] args){
        int[] priorities = {2,1,3,2}, priorities2 = {1,1,9,1,1};
        int location=2, location2=0;

        System.out.println(solution(priorities,location));
    }
    public static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int num : priorities){
            queue.add(num);//우선순위 큐에 내림차순으로 정렬
        }
        //큐에는 우선순위대로 들어가있고
        //priorities 에는 원본 데이터
        //큐의 제일 먼저 나올 엘리먼트가 priorities 배열에서 몇번째에있던 것인지 확인->i값
        //IF priorities 배열과 큐에서 나올 엘리먼트가 동일하다면
        //그 엘리먼트의 priorities에서의 인덱스 값 확인
        int answer=1;
        for(int i=0;i<priorities.length;i++){
            if(queue.peek()==priorities[i]){
                if(priorities[i]==queue.peek()){
                    if(i==location) {
                        return answer;
                    }
                    queue.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}
