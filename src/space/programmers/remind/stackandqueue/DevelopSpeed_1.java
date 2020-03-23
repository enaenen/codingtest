package programmers.remind.stackandqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DevelopSpeed_1 {
    public static void main(String[] args) {
        for (int i : solution2(new int[]{93, 30, 55}, new int[]{1, 30, 5})) {
            System.out.println(i);
        }
    }

    private static int[] solution2(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<Integer>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();

        for(int i =0;i<progresses.length;i++){
            que.add((100-progresses[i])%speeds[i] !=0 ? (100-progresses[i])/speeds[i]+1 : (100-progresses[i])/speeds[i]);
        }
        int first = que.poll();
        int done=1;
        while(!que.isEmpty()){
            int second = que.poll();
            if(first>=second){
                done++;
            }
            else {
                tempList.add(done);
                first=second;
                done=1;
            }
        }
        tempList.add(done);
        int[] answer = new int[tempList.size()];
        for(int i=0;i<tempList.size();i++){
            answer[i]=tempList.get(i);
        }

        return answer;
    }
}
