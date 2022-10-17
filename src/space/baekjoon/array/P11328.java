package space.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int[] arr = new int[26];
            String[] strSet = br.readLine().split(" ");
            for (char c : strSet[0].toCharArray())
                arr[c - 'a']++;
            for (char c : strSet[1].toCharArray())
                arr[c - 'a']--;
            boolean isEqual = true;
            for (int x : arr) {
                if (x!=0) {
                    isEqual = false;
                    break;
                }
            }
            if( isEqual)
                System.out.println("Possible");
            else
                System.out.println("Impossible");
        }
    }
}
