package space.study.week03.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cabbage1012 {
    public static int counter;
    public static int xMax;
    public static int yMax;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            counter = 0;
            // Init
            String[] input = br.readLine().split(" ");
            xMax = Integer.parseInt(input[0]);
            yMax = Integer.parseInt(input[1]);
            int map[][] = new int[yMax][xMax];
            int planted = Integer.parseInt(input[2]);
            for (int i = 0; i < planted; i++) {
                String[] coordinate = br.readLine().split(" ");
                map[Integer.parseInt(coordinate[1])][Integer.parseInt(coordinate[0])] = 1;
            }

            // Find Connected map
            for (int i = 0; i < yMax; i++) {
                for (int j = 0; j < xMax; j++) {
                    if (map[i][j] == 1) {
                        counter++;
                        //x+1 y+1씩 찾으면서 연결된 1들을 0처리
                        findConnectedMap(map, i, j);
                    }
                }
            }
            System.out.println(counter);
        }
    }

    public static void findConnectedMap(int[][] map, int y, int x) {
        if (x < 0 || y < 0 || xMax - 1 < x || yMax - 1 < y || map[y][x] == 0)
            return;

        map[y][x] = 0;
        findConnectedMap(map, y, x + 1);
        findConnectedMap(map, y, x - 1);
        findConnectedMap(map, y + 1, x);
        findConnectedMap(map, y - 1, x);
    }
}
