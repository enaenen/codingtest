package space.barkingdog.bfs1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P1012 {
    public static class Pair {
        public int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (0 < tc--) {
            int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int width = inputs[0];
            int height = inputs[1];

            boolean[][] field = new boolean[height][width];
//            boolean[][] visited = new boolean[height][width];
            int planted = inputs[2];
            for (int i = 0; i < planted; i++) {
                int[] location = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                field[location[1]][location[0]] = true;
            }
            int[] xOffset = {1, -1, 0, 0};
            int[] yOffset = {0, 0, -1, 1};
            Queue<Pair> que = new LinkedList<Pair>();
            int answer = 0;
            for (int i = 0; i < height; ++i) {
                for (int j = 0; j < width; ++j) {
                    if (!field[i][j])
                        continue;
                    answer++;
                    que.offer(new Pair(j, i));
                    field[i][j] = false;
                    while (!que.isEmpty()) {
                        Pair currentLocation = que.poll();
                        for (int k = 0; k < 4; k++) {
                            int nextX = currentLocation.x + xOffset[k];
                            int nextY = currentLocation.y + yOffset[k];
                            if (nextX < 0 || nextY < 0 || width <= nextX || height <= nextY)
                                continue;
                            if (field[nextY][nextX]) {
                                que.offer(new Pair(nextX, nextY));
                                field[nextY][nextX] = false;
                            }
                        }
                    }
                }
            }
            System.out.println(answer);
        }
    }
}