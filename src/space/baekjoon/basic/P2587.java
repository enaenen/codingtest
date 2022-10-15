package space.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        System.out.println(Arrays.stream(arr).sum() / 5);
        System.out.println(arr[2]);
    }
}
