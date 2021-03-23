package space.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dp = new int[21];
        int n = Integer.parseInt(br.readLine());
        System.out.println(recursive(n, dp));
    }
    public static int recursive(int n,int[] dp) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        else{
            dp[n]=recursive(n-2,dp) + recursive(n-1,dp);
            return dp[n];
        }
    }
}
