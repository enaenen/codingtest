package space.programmers.remind.stackandqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DevelopSpeed {
    public static void main(String[] args){
        for(int i : solution(new int[] {93,30,55},new int[] {1,30,5})){
            System.out.println(i);
        }

    }
    public static int[] solution(int[] progresses, int[] speeds){
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<progresses.length;i++){
            queue.add((100-progresses[i])%speeds[i]==0 ? (100-progresses[i])/speeds[i] : (100-progresses[i])/speeds[i]+1);
        }
        List<Integer> list = new ArrayList<Integer>();
        int standard = queue.poll();
        int deployCount = 1;

        while(!queue.isEmpty()){
            int compareNumber = queue.poll();
            if(standard>=compareNumber){
                deployCount++;
            }
            else{
                list.add(deployCount);
                deployCount=1;
                standard=compareNumber;
            }
        }
        list.add((deployCount));
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
