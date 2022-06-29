package space.studyin42;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  음료수를 왜 얼려먹나 그냥 먹지
 *  input
 *  4 5
 * 00110
 * 00011
 * 11111
 * 00000
 *
 * EXPECTED : 3
 */
public class IcedDrinkDFS {
    static boolean dfs(int x, int y, int[][] graph, int maxX, int maxY) {
        if (x < 0 || maxX <= x || y < 0 || maxY <= y)
            return false;
        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            //방문처리
            dfs(x, y + 1, graph, maxX, maxY);
            dfs(x, y - 1, graph, maxX, maxY);
            dfs(x - 1, y, graph, maxX, maxY);
            dfs(x + 2, y, graph, maxX, maxY);
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputs = br.readLine().toCharArray();

        int n = inputs[0] - '0';
        int m = inputs[2] - '0';

        int[][] graph = new int[n][m];
        int result = 0;

        for (int i = 0; i < n; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j =0; j < line.length; j++)
                graph[i][j] = line[j] - '0';
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j, graph, n, m) == true)
                    result += 1;
            }
        }
        System.out.println(result);
    }
}
