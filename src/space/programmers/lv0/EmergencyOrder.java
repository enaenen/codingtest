package space.programmers.lv0;

import java.util.Arrays;

public class EmergencyOrder {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < sorted.length / 2; i++) {
            int temp = sorted[i];
            sorted[i] = sorted[sorted.length - 1 - i];
            sorted[sorted.length - 1 - i] = temp;
        }

        for (int i = 0; i < emergency.length; ++i){
            for(int j = 0; j < sorted.length; ++j){
                if (emergency[i] == sorted[j])
                    answer[i] = j + 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] solution = solution(new int[]{3, 76, 24});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
