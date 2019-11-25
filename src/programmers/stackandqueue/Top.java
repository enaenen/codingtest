package programmers.stackandqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Top {
    public static void main(String[] args){
        for(int i : solution(new int[] {6,9,5,7,4})){
            System.out.println(i);
        }
        System.out.println("------");
        for(int i : solution(new int[] {3,9,9,3,5,7,2})){
            System.out.println(i);
        }
        System.out.println("------");
        for(int i : solution(new int[] {1,5,3,6,7,6,5})){
            System.out.println(i);
        }

    }
    public static int[] solution(int[] heights){
        int[] answer =new int[heights.length];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i : heights) {
            stack.push(i);
        }
        List<Integer> list = new ArrayList<Integer>();
        int stackCounter=1;
        int standard = stack.pop();
        while(true){
            if(stack.empty())
                break;
            int compareNumber = stack.pop();
            if(standard<compareNumber){
                list.add(heights.length-stackCounter);
                // standard=stack.pop();
                standard=compareNumber;
            }else{
                list.add(0);
                compareNumber=stack.pop();
                stackCounter++;
            }
        }
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(list.size()-1);
        }
        return answer;
    }
}
