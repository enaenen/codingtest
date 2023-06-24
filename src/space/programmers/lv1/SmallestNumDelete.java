package space.programmers.lv1;

import java.util.Arrays;

public class SmallestNumDelete {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
    }
    public static int[] solution(int[] arr) {
        if (arr.length == 1)
            return new int[]{-1};
        int[] answer = new int[arr.length - 1];
        int min = Arrays.stream(arr).min().getAsInt();
        int j = 0;
        for (int i = 0; i < arr.length; ++i){
            if (arr[i] == min)
                continue;
            answer[j++] = arr[i];
        }
        return answer;
    }
}
