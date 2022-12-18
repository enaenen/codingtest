package space.barkingdog.bfs1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P10026 {
    private static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        char map[][] = new char[n][n];
        boolean visited[][] = new boolean[n][n];
        int dirX[] = {1, -1, 0, 0};
        int dirY[] = {0, 0, -1, 1};
        Queue<Pair> que = new LinkedList<Pair>();
        int answer = 0;
        //Normal
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++)
                map[i][j] = line.charAt(j);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j])
                    continue;
                answer++;
                que.offer(new Pair(j, i));
                visited[i][j] = true;
                char currentColor = map[i][j];
                while (!que.isEmpty()) {
                    Pair currentPos = que.poll();
                    for (int k = 0; k < dirY.length; k++) {
                        int nextX = currentPos.x + dirX[k];
                        int nextY = currentPos.y + dirY[k];
                        if (nextX < 0 || nextY < 0 || n <= nextX || n <= nextY)
                            continue;
                        if (map[nextY][nextX] != currentColor || visited[nextY][nextX])
                            continue;
                        que.offer(new Pair(nextX, nextY));
                        visited[nextY][nextX] = true;
                    }
                }
            }
        }
        sb.append(answer);
        sb.append(" ");

        answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = false;
                if (map[i][j] == 'G')
                    map[i][j] = 'R';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j])
                    continue;
                answer++;
                que.offer(new Pair(j, i));
                visited[i][j] = true;
                char currentColor = map[i][j];
                while (!que.isEmpty()) {
                    Pair currentPos = que.poll();
                    for (int k = 0; k < dirY.length; k++) {
                        int nextX = currentPos.x + dirX[k];
                        int nextY = currentPos.y + dirY[k];
                        if (nextX < 0 || nextY < 0 || n <= nextX || n <= nextY)
                            continue;
                        if (map[nextY][nextX] != currentColor || visited[nextY][nextX])
                            continue;
                        que.offer(new Pair(nextX, nextY));
                        visited[nextY][nextX] = true;
                    }
                }
            }
        }
        sb.append(answer);
        System.out.println(sb.toString());
    }
}
