package space.vivarepub;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.regex.Pattern;

public class P1 {

    public static void main(String[] args) {
        int N = 2;
        System.out.println(solution("1451232125",N));
        System.out.println(solution("1451232125",N));
    }
    public static int solution(String s, int N) {
        int answer = -1;
        List<String> combinations = generateCombinations(N);
        for (String combination : combinations) {
            if (s.contains(combination))
               answer = answer < Integer.valueOf(combination) ? Integer.valueOf(combination) : answer;
        }
        return answer;
    }

    public static List<String> generateCombinations(int N) {
        List<String> combinations = new ArrayList<>();
        int[] nums = new int[N];
        boolean[] used = new boolean[N + 1];

        generate(nums, used, 0, N, combinations);

        return combinations;
    }

    private static void generate(int[] nums, boolean[] used, int index, int N, List<String> combinations) {
        if (index == N) {
            StringBuilder sb = new StringBuilder();
            for (int num : nums) {
                sb.append(num);
            }
            combinations.add(sb.toString());
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!used[i]) {
                used[i] = true;
                nums[index] = i;
                generate(nums, used, index + 1, N, combinations);
                used[i] = false;
            }
        }
    }
}

