package space.study.week02;
/**
 * 21-04-15
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower11729 {
    private static StringBuilder sb = new StringBuilder();
    private static int counter;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(Integer.parseInt(br.readLine()), 1, 2, 3);
        System.out.println(counter);
        System.out.println(sb.toString());
    }

    public static void solution(int n, int start, int middle, int end) {
        counter++;
        if (n == 1) {
            sb.append(start + " " + end + "\n");
        } else {
            solution(n-1, start, end, middle);
            sb.append(start + " " + end + "\n");
            solution(n-1, middle, start, end);
        }
    }
}
