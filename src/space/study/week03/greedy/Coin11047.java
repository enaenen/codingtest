package space.study.week03.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coin11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int coins[] = new int[n];

        for (int i = 0; i < n; i++)
            coins[i] = Integer.parseInt(br.readLine());

        n = 0;
        for (int i = coins.length - 1 ; i >= 0 || k != 0; i--) {
            n += k/coins[i];
            k %= coins[i];
        }
        System.out.println(n);
    }
}
