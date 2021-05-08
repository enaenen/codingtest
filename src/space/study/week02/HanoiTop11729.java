package space.study.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/11729
 * 21-04-13
 */
public class HanoiTop11729 {

    public static int cnt = 0;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        hanoi(n, 1, 2, 3);
        sb.insert(0, cnt + "\n");
        System.out.println(sb);
    }
//from, middle, to
    public static void hanoi(int num, int start, int middle, int end) {
        if (num == 1) {
            sb.append(start + " " + end + "\n");

            cnt++;
        } else {
            hanoi(num - 1, start, end, middle);//n-1개의 원반을 A에서 B로 이동
            sb.append(start + " " + end + "\n");
            cnt++;
            hanoi(num - 1, middle, start, end);//n-1개의 원반을 B에서 C로
        }
    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int rounds = Integer.parseInt(br.readLine());
//
//    }
}
