package space.programmers.remind.stackandqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOne {
    public static void main(String[] args){
        int[] p = {93,30,55};
        int[] s = {1,30,5};
        for(int a : solution(p,s)){
            System.out.println(a);
        }

    }
    public static int[] solution(int[] progresses, int[] speeds){
        Queue<Integer> time = new LinkedList<Integer>();
        for(int i=0;i<progresses.length;i++){
            time.add((100-progresses[i])%speeds[i]==0 ? ((100-progresses[i])/speeds[i]) : ((100-progresses[i])/speeds[i]+1));
        }

        int firstEnd = time.poll();//최초 기준점 설정
        List<Integer> save = new ArrayList<Integer>();

        int counter =1;
        while(!time.isEmpty()){
            int secondEnd = time.poll();
            if(firstEnd>=secondEnd){
                counter++;
            }
            else{
                save.add(counter);
                counter=1;
                firstEnd=secondEnd;//이게 else문 밖에있어서 에러가 통과가 안되었었다
                //때로는 sencond가 이 바로전순서의 숫자가 아닌 전전것이 될수도 있다 if 문에 걸릴경우
            }
        }
        save.add(counter);

        int[] answer = new int[save.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=save.get(i);
        }

        return answer;
    }
}
