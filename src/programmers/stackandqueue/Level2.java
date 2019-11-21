package programmers.stackandqueue;

import java.util.*;

public class Level2 {
    public static void main(String[] args){
        int[] priorities = {2,1,3,2}, priorities2 = {1,1,9,1,1};
        int location=2, location2=0;

        solution(priorities,location);
    }
    public static int solution(int[] priorities, int location) {
        /*
        Queue<Integer> list = new LinkedList<Integer>();
        int[] arr  = priorities.clone();
        for(int i=0;i<priorities.length;i++) {
            list.add(priorities[i]);
        }
        Integer[] integerArr = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
        Arrays.sort(integerArr, Comparator.reverseOrder());
        int count=0;
        int value;
        int target = priorities[location];
        //int[] saving=new int[priorities.length];
        while(true){
            value=list.poll();
            if(value==integerArr[count]){
                count++;
                if(value==target)
                    return count;
            }
            else{
                list.add(value);
            }
        }
    }
         */
        PriorityQueue<Integer> list = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int a : priorities){
            list.add(a);
            System.out.println(list);
        }

        return  1;
    }
}
