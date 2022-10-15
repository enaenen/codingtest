package space.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2309 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[9];
        boolean isFound = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; ++i)
            arr[i] = Integer.parseInt(br.readLine());
        int totalHeight = Arrays.stream(arr).sum();
        for (int i = 0; i < 9; ++i) {
            if (isFound)
                break;
            for (int j = i + 1; j < 9; ++j) {
                if (totalHeight - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    isFound = true;
                    break;
                }
            }
        }
        Arrays.sort(arr);
        for (int i = 2; i < 9; ++i)
            System.out.println(arr[i]);
    }
}
