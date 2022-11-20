package space.barkingdog.bfs1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P10026_1 {
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
        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];
        boolean[][] visited = new boolean[n][n];
        boolean[][] visitedForWeakColor = new boolean[n][n];
        int area = 0;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j);
            }
        }
        Queue<Pair> que = new LinkedList<Pair>();
        char prev = 0;
        int[] offsetX = {1, -1, 0, 0};
        int[] offsetY = {0, 0, -1, 1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] || prev == map[i][j]) continue;
                area++;
                que.offer(new Pair(i, j));
                prev = map[i][j];
                visited[i][j] = true;
                while (!que.isEmpty()) {
                    Pair p = que.poll();
                    for (int k = 0; k < 4; k++) {
                        int nextX = p.x + offsetX[k];
                        int nextY = p.y + offsetY[k];
                        if (nextX < 0 || nextY < 0 || n <= nextX || n <= nextY)
                            continue;
                        if (visited[nextY][nextX])
                            continue;
                        visited[nextY][nextX] = true;
                        que.offer(new Pair(nextY, nextX));
                    }
                }//same area range check
            }
            prev = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 'G')
                    map[i][j] = 'R';
            }
        }
        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        */

        int area2 = 0;
        prev =1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visitedForWeakColor[i][j] || prev == map[i][j]) continue;
                area2++;
                que.offer(new Pair(i, j));
                prev = map[i][j];
                visitedForWeakColor[i][j] = true;
                while (!que.isEmpty()) {
                    Pair p = que.poll();
                    for (int k = 0; k < 4; k++) {
                        int nextX = p.x + offsetX[k];
                        int nextY = p.y + offsetY[k];
                        if (nextX < 0 || nextY < 0 || n <= nextX || n <= nextY)
                            continue;
                        if (visitedForWeakColor[nextY][nextX])
                            continue;
                        visitedForWeakColor[nextY][nextX] = true;
                        que.offer(new Pair(nextY, nextX));
                    }
                }//same area range check
            }
            prev = 0;
        }
        System.out.println(area + " " + area2);
    }
}
