package space.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        int x = Integer.parseInt(br.readLine());
        int cnt = 0;
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int sum = arr[start] + arr[end];
            if (sum == x)
                cnt++;
            if (sum <= x)
                start++;
            else
                end--;
        }
        System.out.print(cnt);
    }
}
