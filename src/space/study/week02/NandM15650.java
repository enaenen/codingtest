package space.study.week02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 21-04-10
 * https://www.acmicpc.net/problem/15650
 */
public class NandM15650 {
    public static StringBuilder sb = new StringBuilder();
    public static int[] combinations;
    public static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNumbers = br.readLine().split(" ");
        int n = Integer.parseInt(inputNumbers[0]);
        int m = Integer.parseInt(inputNumbers[1]);
        combinations = new int[m];
        visited = new boolean[n];
        backtrack(n, m, 0);
        System.out.print(sb);
    }

    public static void backtrack(int n, int m, int depth) {
        if (depth == m) {
            for (int num : combinations)
                sb.append(num + " ");
            sb.append('\n');
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combinations[depth] = i + 1;
                backtrack(n, m, depth + 1);
                visited[i] = false;
            }
        }
        return;
    }
}
