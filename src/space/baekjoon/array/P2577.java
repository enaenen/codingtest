package space.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long total = 1;
        for (int i = 0; i < 3 ; i++) {
            int n = Integer.parseInt(br.readLine());
            total *= n;
        }
        String totalString = String.valueOf(total);
        int[] arr = new int[10];
        for(int i =0; i<totalString.length(); i++){
            arr[totalString.charAt(i) - '0']++;
        }
        for (int n : arr) {
            System.out.println(n);
        }
    }
}
