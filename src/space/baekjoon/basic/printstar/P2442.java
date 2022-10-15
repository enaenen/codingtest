package space.baekjoon.basic.printstar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < n; i++) {
            for (int j = n - i; 1 < j; j--)
                System.out.print(" ");
            for (int j = -1; j < i * 3; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
