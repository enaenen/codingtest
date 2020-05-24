package space.baekjoon.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2133_re {
    private static int[] memo;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        memo=new int[n];
        System.out.println(dp(n));

    }
    public static int dp(int num){
        if(num==0) return 1;
        if(num==1) return 0;
        if(num==2) return 3;
        if(memo[num] !=0) return memo[num];

        int result = 3 * memo[num-2];
        for(int i=3;i<=num;i++){
            if(i%2==0){
                result +=2 * memo[num-i];
            }
        }

        return memo[num]=result;
    }
}
