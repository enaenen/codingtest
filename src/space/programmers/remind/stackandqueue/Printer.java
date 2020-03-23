package space.programmers.remind.stackandqueue;

import java.util.*;

public class Printer {
    public static void main(String[] args){
        int[] priorities = {4,5,6,7}, priorities2 = {1,1,9,1,1};
        int location=0, location2=0;

        System.out.println(solution(priorities,location));
    }
    public static class Paper {
        private int priority;
        private int index;

        public Paper(int priority, int index) {
            this.priority=priority;
            this.index=index;
        }

    }
    public static int solution(int[] priorities, int location){
        LinkedList<Paper> list = new LinkedList<Paper>();
        for(int i=0;i<priorities.length;i++){
            list.add(new Paper(priorities[i],i));
        }
        int answer=1;
        while(list.size()>1){
            Paper first = list.getFirst();
            for(int i=1;i<list.size();i++){
                if(first.priority<list.get(i).priority){//제일 큰 priority 확인
                    list.removeFirst();
                    list.addLast(first);
                    break;
                }
                if(i==list.size()-1){
                    if(first.index==location){
                        return answer;
                    }
                    list.removeFirst();
                    answer++;
                }
            }
        }
        return answer;
    }
}
