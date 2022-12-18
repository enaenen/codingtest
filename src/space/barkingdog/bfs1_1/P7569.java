package space.barkingdog.bfs1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P7569 {
    private static class Position {
        int h, n, m;

        public Position(int h, int n, int m) {
            this.h = h;
            this.n = n;
            this.m = m;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] info = br.readLine().split(" ");
        int h = Integer.parseInt(info[0]);
        int n = Integer.parseInt(info[1]);
        int m = Integer.parseInt(info[2]);

        int dirH[] = {1, -1, 0, 0, 0, 0};
        int dirN[] = {0, 0, 1, -1, 0, 0};
        int dirM[] = {0, 0, 0, 0, 1, -1};

        //INIT
        int map[][][] = new int[h][n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String line = br.readLine();
                for (int k = 0; k < h; k++) {
                    map[k][i][j] = line.charAt(k);
                }
            }
        }
        //FIND 1
        Queue<Position> que = new LinkedList<Position>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if(map[i][j][k] == 1)
                        que.offer(new Position(i,j,k));
                }
            }
        }
        //BFS
        while (!que.isEmpty()){
            Position cur = que.poll();
            for (int i = 0; i < 6; i++){
                int nextH = cur.h + dirH[i];
                int nextN = cur.n + dirN[i];
                int nextM = cur.m + dirM[i];

                if (nextH < 0 || nextN < 0 || nextM < 0 || h <= nextH || n <= nextN || m <= nextM)
                    continue;
                if (map[nextH][nextN][nextM] == 0) {
                    que.offer(new Position(nextH, nextN, nextM));
                    map[nextH][nextN][nextM] = map[cur.h][cur.n][cur.m] + 1;
                }
            }
        }
        int days = Integer.MIN_VALUE;
        for (int i = 0; i < h; i++){
            for(int j = 0; j < n; j++){
                for (int k = 0; k < m; k++){
                    if (map[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    days = Math.max(days, map[i][j][k]);
                }
            }
        }
        if (days == 1) System.out.println(0);
        else System.out.println(days);
    }
}
