package space.programmers.dfsbfs;

public class NetworkProblem {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        System.out.println(solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
    }

    public static void dfsSolution(int[][] computers, int i, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < computers.length; j++) {
            if (i != j && !visited[j] && computers[i][j] == 1)
                dfsSolution(computers, j, visited);
        }
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfsSolution(computers, i, visited);
                answer++;
            }
        }
        return answer;
    }
}
