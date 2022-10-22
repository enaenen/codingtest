package space.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P3273_On {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = Integer.parseInt(br.readLine());
        boolean[] answer = new boolean[2000001];
        int cnt = 0;
        for (int n : arr) {
            if(x > n && answer[x - n])
                cnt++;
            answer[n] = true;
        }
        System.out.print(cnt);
    }
}
