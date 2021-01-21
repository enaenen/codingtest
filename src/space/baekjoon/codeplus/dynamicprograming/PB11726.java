package space.baekjoon.codeplus.dynamicprograming;
//D[n] = D[n-1] + D[n-2] 2XN 의 사각형을 채우는 경우의 수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PB11726 {
    private static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2];
            dp[i] %= 10007;
        }
        System.out.println(dp[n]);
    }
}
