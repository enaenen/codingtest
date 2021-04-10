package space.study.week02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 백트래킹
 * 21-04-10
 * https://www.acmicpc.net/problem/15649
 */
public class NAndM15649 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        boolean[] visited = new boolean[n];
        StringBuilder answer = new StringBuilder();

        int[] combinations = new int[m];
        backtrack(n, m, 0, visited, combinations, answer);
        System.out.print(answer);
    }

    public static void backtrack(int n, int m, int depth, boolean[] visited, int[] combinations, StringBuilder answer) {
        if (depth == m) {
            for (int combination : combinations)
                answer.append(combination + " ");
            answer.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combinations[depth] = i + 1;
                backtrack(n, m, depth + 1, visited, combinations, answer);
                visited[i] = false;
            }
        }
        return;
    }
}
