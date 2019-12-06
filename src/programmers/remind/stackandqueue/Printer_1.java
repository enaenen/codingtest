package programmers.remind.stackandqueue;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class Printer_1 {
    public static void main(String[] args){
        int[] priorities = {4,5,6,7}, priorities2 = {1,1,9,1,1};
        int location=0, location2=0;

        System.out.println(solution(priorities2,location2));
    }
    public static class Paper{
        int priority;
        int index;

        public Paper(int priority, int index){
            this.priority=priority;
            this.index=index;
        }
    }

    private static int solution(int[] priorities, int location) {
        int answer=1;
        LinkedList<Paper> list = new LinkedList<Paper>();

        for(int i=0;i<priorities.length;i++){
            list.add(new Paper(priorities[i],i));
        }

        while(list.size()>1){
            Paper paper = list.getFirst();
            for(int i =1;i<list.size();i++){
                if(paper.priority<list.get(i).priority){
                    list.removeFirst();
                    list.addLast(paper);
                    break;
                }
                if(i==list.size()-1){//위에서 priority 순으로 정리를 마치게 하기위해 list.size()-1 만큼이 될때까지 대기
                    if(paper.index==location) {//현재 뽑기직전 대기열에 넣은 index 와 location 비교
                        return answer;
                    }
                    answer++;
                    list.removeFirst();
                }
            }
        }
        return answer;
    }
}
