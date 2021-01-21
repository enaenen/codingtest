package space.baekjoon.codeplus.dynamicprograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * X가 3으로 나뉘면 3으로 나눈다
 * X가 2로 나뉘면 2로 나눈다
 * 1을 뺀다.
 * N을 1로만드는
 */
public class P1463 {
    private static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp=new int[n+1];
        System.out.println(recursive(n));
    }
    public static int recursive(int n){
        if(n==1) return 0;
        if(dp[n]>0) return dp[n];
        dp[n] = recursive(n - 1)+1;
        if(n%2==0){
            int divided=recursive(n/2)+1;
            if(dp[n]>divided) dp[n]=divided;
        }
        if(n%3==0){
            int divided = recursive(n/3)+1;
            if(dp[n]>divided) dp[n]=divided;
        }
        return dp[n];
    }
}
