package space.programmers;

import java.util.HashSet;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/1845
 * 21-04-06
 */
public class Phoneketmon {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3,1,2,3}));
        System.out.println(solution(new int[] {3,3,3,2,2,4}));
        System.out.println(solution(new int[] {3,3,3,2,2,2}));
    }
    public static int solution(int[] nums) {
        int answer = 1;
        int availablePick = 0;
        int cases = 0;
        availablePick = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);
        cases = set.size();

        if(availablePick < cases)
            answer = availablePick;
        else
            answer = cases;

        return answer;
    }
}
