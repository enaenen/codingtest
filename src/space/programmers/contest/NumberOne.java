package space.programmers.contest;

import java.util.*;

public class NumberOne {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{2, 1, 3, 4, 1});
        for(int i : solution){
            System.out.println(i);
        }
    }

    public static int[] solution(int[] input) {
        int[] answer = {};
        HashSet<Integer> answerSet = new HashSet<>();
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                answerSet.add(input[i] + input[j]);
            }
        }
        answer = new int[answerSet.size()];
        Iterator<Integer> iterator = answerSet.iterator();
        for (int i = 0; i < answer.length; i++) {
            answer[i] = iterator.next();
        }
        return answer;
    }
}
