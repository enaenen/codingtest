package space.study.week02;
/**
 * 21-04-07
 * https://programmers.co.kr/learn/courses/30/lessons/12910
 */

import java.util.ArrayList;
import java.util.List;

public class MatchingNumArray {
    public static void main(String[] args) {
        int[] s1 = solution(new int[]{5, 9, 7, 10}, 5);
        for (int i : s1)
            System.out.println(i);

        int[] s2 = solution(new int[]{2, 36, 1, 3}, 1);
        for (int i : s2)
            System.out.println(i);

        int[] s3 = solution(new int[]{3, 2, 6}, 10);
        for (int i : s3)
            System.out.println(i);
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int[] answer;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0)
                list.add(arr[i]);
        }
        if(list.isEmpty())
            list.add(-1);
        answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
