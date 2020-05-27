package space.baekjoon.dp;

import java.util.Scanner;

public class P11727RE {
    private static int[] memo = new int[1000];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(dp(n));
    }
    public static int dp(int a){
        if(a==1) return 1;
        if(a==2) return 3;
        if(memo[a]!=0) return memo[a];
        return memo[a]=dp(a-1)+dp(a-2)*2;
    }

}
