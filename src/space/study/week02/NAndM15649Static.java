package space.study.week02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 15949 전역변수버전
 */
public class NAndM15649Static {
    public static StringBuilder ANSWER = new StringBuilder();
    public static boolean[] VISITED;
    public static int[] COMBINATIONS;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        VISITED = new boolean[n];
        COMBINATIONS = new int[m];
        backtrack(n, m, 0);
        System.out.print(ANSWER);
    }

    public static void backtrack(int n, int m, int depth) {
        if (depth == m) {
            for (int combination : COMBINATIONS)
                ANSWER.append(combination + " ");
            ANSWER.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!VISITED[i]) {
                VISITED[i] = true;
                COMBINATIONS[depth] = i + 1;
                backtrack(n, m, depth + 1);
                VISITED[i] = false;
            }
        }
        return;
    }
}
