package space.baekjoon.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11726 {
    public static int[] dp = new int[1001];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        System.out.println(getNum(n));

    }
    public static int getNum(int x){
        if(x==1) return 1;
        if(x==2) return 2;
        if(dp[x]!=0) return dp[x];
        return dp[x]=(getNum(x-1)+getNum(x-2)) % 10007 ;
    }
}
