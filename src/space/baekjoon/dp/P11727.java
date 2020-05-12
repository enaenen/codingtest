package space.baekjoon.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11727 {
    public static int[] memo = new int[1001];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(dp(n));
    }
    public static int dp(int x){
        if(x==1)return 1;
        if(x==2)return 3;
        if(memo[x]!=0) return memo[x];
        return memo[x]=(dp(x-1) + 2*dp(x-2))%10007;
    }

}
