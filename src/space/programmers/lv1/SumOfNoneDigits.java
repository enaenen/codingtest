package space.programmers.lv1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfNoneDigits {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }
    public static int solution(int[] numbers){
        int answer = 0;
        String str = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining());
        for (int i = 0; i < 10; ++i){
            if (str.contains(String.valueOf(i)))
                continue;
            answer += i;
        }
        return answer;
    }
}
