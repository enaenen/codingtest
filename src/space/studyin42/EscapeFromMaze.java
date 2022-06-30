package space.studyin42;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class EscapeFromMaze {
    public static int bfs(Queue<String> queue, int[][] graph, int maxX, int maxY) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};

        while (!queue.isEmpty()) {
            char[] dequeued = queue.poll().toCharArray();
            int x = dequeued[0] - '0';
            int y = dequeued[1] - '0';
            int nx;
            int ny;
            for (int i = 0; i < dx.length; i++) {
                nx = x + dx[i];
                ny = y + dy[i];
                if (nx < 0 || ny < 0 || maxX <= nx || maxY <= ny)
                    continue;
                if (graph[nx][ny] == 0)
                    continue;
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    String set = "" + nx + "" + ny;
                    queue.add(set);
                }
            }
        }
        return graph[maxX-1][maxY-1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputs = br.readLine().toCharArray();


        int n = inputs[0] - '0';
        int m = inputs[2] - '0';
        int[][] graph = new int[n][m];
        Queue<String> queue = new ArrayDeque<String>();
        queue.add("00");
        for (int i = 0; i < n; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j = 0; j < line.length; j++)
                graph[i][j] = line[j] - '0';
        }
        System.out.println(bfs(queue, graph, n, m));
    }
}
