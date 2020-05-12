package space.baekjoon.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2133 {
    public static int[] memo = new int[1001];

    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(dp(n));
    }
    public static int dp(int x){
        if(x==0) return 1;
        if(x==1) return 0;
        if(x==2) return 3;
        if(memo[x]!=0) return memo[x];
        int result = dp(x-2)*3;
        for(int i=3;i<=x;i++){
            if(i%2==0)
                result+=2*dp(x-i);
        }
        return memo[x]=result;
    }
}
