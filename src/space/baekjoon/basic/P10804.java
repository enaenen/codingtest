package space.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[21];

        for (int i = 1; i < 21; i++)//init
            arr[i] = i;

        for (int i = 0; i < 10; i++) {
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            while (start < end) {
                int swapTmp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = swapTmp;
            }
        }
        for(int i =1; i < 21; i++)
            System.out.print(arr[i]+ " ");
    }
}
