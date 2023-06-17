package space.programmers.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongAlign {
    public static long solution(long n) {
       long answer = 0;
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        for (int i = arr.length - 1; -1 < i; --i) {
            answer += arr[i] - '0';
            answer *= 10;
        }
        return answer / 10;
    }
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
