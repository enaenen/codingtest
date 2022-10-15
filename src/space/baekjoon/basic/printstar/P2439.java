package space.baekjoon.basic.printstar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) + 1;
        for(int i = 1; i < n; i++){
            for (int j = n-1; i < j; j--)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
