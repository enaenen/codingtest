package space.study.week02;
/**
 * 21-04-07
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */

import java.util.ArrayList;
import java.util.List;

public class NoSameNumber {
    public static void main(String[] args) {
        int[] s1 = solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        for (int i : s1) {
            System.out.println(i);
        }
        int[] s2 = solution(new int[]{4, 4, 4, 4, 3, 3});
        for (int i : s2) {
            System.out.println(i);
        }
    }
    public static int[] solution(int []arr) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        int prev = -1;

        for(int i = 0;i<arr.length;i++){
            if(prev==arr[i])
                continue;
            prev = arr[i];
            list.add(prev);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
