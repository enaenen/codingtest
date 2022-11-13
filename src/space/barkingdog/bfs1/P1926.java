package space.barkingdog.bfs1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1926 {
    public static class Pair {
        public int x, y;

        public Pair(int y, int x) {
            this.x = x;
            this.y = y;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[1]);
        int y = Integer.parseInt(input[0]);
        int[][] map = new int[y][x];
        boolean[][] visited = new boolean[y][x];
        //directions
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        //Map Init
        for (int i = 0; i < y; i++) {
            int[] xPos = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < xPos.length; j++) {
                map[i][j] = xPos[j];
            }
        }
        //Map Init END

        Queue<Pair> que = new LinkedList<Pair>();

        //BFS
        int count = 0;
        int oneArea = 0;
        int max = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    oneArea = 0;
                    que.offer(new Pair(i, j));
                    visited[i][j] = true;
                    count++;
                    while (!que.isEmpty()) {
                        oneArea++;
                        Pair position = que.poll();
                        for (int k = 0; k < 4; k++) {
                            int nextX = position.x + dx[k];
                            int nextY = position.y + dy[k];
                            if (nextX < 0 || x <= nextX)
                                continue;
                            if (nextY < 0 || y <= nextY)
                                continue;
                            if (map[nextY][nextX] == 1 && !visited[nextY][nextX]) {
                                que.offer(new Pair(nextY, nextX));
                                visited[nextY][nextX] = true;
                            }
                        }
                    }
                    if (max < oneArea)
                        max = oneArea;
                }
            }
        }
        System.out.print(count + "\n" + max);
    }
}
