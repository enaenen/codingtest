package space.programmers;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 2021-04-06
 * 두개 뽑아서 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 */
public class TwoNumberSum {
    public static void main(String[] args) {
        int[] s1 = solution(new int[]{2, 1, 3, 4, 1});
        for (int i : s1) {
            System.out.print(i);
        }
        System.out.println();
        int[] s2 = solution(new int[]{5, 0, 2, 7});
        for (int i : s2) {
            System.out.print(i);
        }
    }
    public static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<numbers.length - 1;i++){
            for(int j=i+1;j<numbers.length;j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();
        //        int j = 0;
//        int[] answer = new int[set.size()];
//        for (Integer i : set) {
//            answer[j++] = i;
//        }
//        Arrays.sort(answer);
        return answer;
    }
}
