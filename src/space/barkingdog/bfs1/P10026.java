package space.barkingdog.bfs1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P10026 {
    public static class Pair {
        public int x;
        public int y;

        public Pair(int y, int x) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        char[][] map = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j);
            }
        }
        Queue<Pair> que = new LinkedList<Pair>();

        int[] dirX = {-1, 1, 0, 0};
        int[] dirY = {0, 0, -1, 1};
        char prev = 0;
        int answer1 = 0;

        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (prev == map[i][j] || visited[i][j]) {
                    prev = map[i][j];
                    continue;
                }

                que.offer(new Pair(i, j));
                visited[i][j] = true;
                answer1++;
                prev = map[i][j];
                while (!que.isEmpty()) {
                    Pair current = que.poll();
                    for (int k = 0; k < 4; k++) {
                        int nextX = current.x + dirX[k];
                        int nextY = current.y + dirY[k];
                        if (nextX < 0 || nextY < 0 || n <= nextX || n <= nextY)
                            continue;
                        if (prev != map[nextY][nextX] || visited[nextY][nextX])
                            continue;
                        que.offer(new Pair(nextY, nextX));
                        visited[nextY][nextX] = true;
                    }
                }
            }
        }
        sb.append(answer1 + " ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 'G')
                    map[i][j] = 'R';
                visited[i][j] = false;
            }
        }
        Queue<Pair> que2 = new LinkedList<Pair>();
        answer1 = 0;
        prev = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //for Normal
                if (!(prev == map[i][j] || visited[i][j])) {
                    que2.offer(new Pair(i, j));
                    visited[i][j] = true;
                    prev = map[i][j];
                    answer1++;
                    while (!que2.isEmpty()) {
                        Pair current = que2.poll();
                        for (int k = 0; k < 4; k++) {
                            int nextX = current.x + dirX[k];
                            int nextY = current.y + dirY[k];
                            if (nextX < 0 || nextY < 0 || n <= nextX || n <= nextY)
                                continue;
                            if (prev != map[nextY][nextX] || visited[nextY][nextX])
                                continue;
                            que2.offer(new Pair(nextY, nextX));
                            visited[nextY][nextX] = true;
                        }
                    }
                }
                prev = map[i][j];
            }
        }
        sb.append(answer1);
        System.out.println(sb.toString());
    }
}
