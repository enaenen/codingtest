package space.programmers;

import java.util.*;

public class NoSameNumber {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,1,3,3,0,1,1}));
    }
    public static int[] solution(int []arr) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<Integer>();

        for(int a : arr){
            set.add(new Integer(a));
        }

        return answer;
    }
}
