package space.programmers.stackandqueue;

import java.util.*;

public class Level2 {
    public static void main(String[] args){
        int[] priorities = {2,1,3,2}, priorities2 = {1,1,9,1,1};
        int location=2, location2=0;

        System.out.println(solution(priorities2,location2));
    }
    public static class Paper{
        int priority;
        int index;

        public Paper(int index,int priority){
            this.index=index;
            this.priority=priority;
        }
    }
    public static int solution(int[] priorities, int location) {
        int answer=1;
        LinkedList<Paper> list = new LinkedList<Paper>();
        Paper first;
        for(int i=0;i<priorities.length;i++) {
            list.add(new Paper(i, priorities[i]));
        }
        while(list.size()>1){
            first = list.getFirst();
            for(int i=1;i<list.size();i++){
                if(first.priority<list.get(i).priority){//
                    list.addLast(first);
                    list.removeFirst();
                    break;
                }
                if(i==list.size()-1) {
                    if (first.index == location) return answer;
                    list.removeFirst();
                    answer++;
                }
            }
        }
        return answer;
    }
}
