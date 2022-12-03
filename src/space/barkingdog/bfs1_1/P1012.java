package space.barkingdog.bfs1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * tc
 * x, y,
 */
public class P1012 {
    private static class Pair {
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int x;
        int y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        while (-1 < --tc) {
            int answer = 0;
            String[] input = br.readLine().split(" ");
            boolean map[][] = new boolean[Integer.parseInt(input[1])][Integer.parseInt(input[0])];
            boolean visited[][] = new boolean[map.length][map[0].length];
            int fields = Integer.parseInt(input[2]);
            for (int i = 0; i < fields; i++) {
                String[] line = br.readLine().split(" ");
                map[Integer.parseInt(line[1])][Integer.parseInt(line[0])] = true;
            }
            int dirX[] = {1, -1, 0, 0};
            int dirY[] = {0, 0, -1, 1};
            Queue<Pair> que = new LinkedList<Pair>();
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[0].length; j++) {
                    if (!map[i][j] || visited[i][j])
                        continue;
                    que.offer(new Pair(j, i));
                    visited[i][j] = true;
                    answer++;
                    while (!que.isEmpty()) {
                        Pair currentLoc = que.poll();
                        for (int k = 0; k < dirY.length; k++) {
                            int nextX = currentLoc.x;
                            int nextY = currentLoc.y;
                            nextX += dirX[k];
                            nextY += dirY[k];
                            if (nextX < 0 || nextY < 0 || map[0].length <= nextX || map.length <= nextY)
                                continue;
                            if (map[nextY][nextX] && !visited[nextY][nextX]) {
                                visited[nextY][nextX] = true;
                                que.offer(new Pair(nextX, nextY));
                            }
                        }
                    }
                }
            }
            sb.append(answer + "\n");
        }
        System.out.println(sb.toString());
    }
}
