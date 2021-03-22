package jooeun.baekjoon;

// https://www.acmicpc.net/problem/9095

import java.util.*;
import java.io.*;

public class P_9095 {

    public static void main(String[] args) throws IOException{

//        int n = 3;
//        int[] ary = {4, 7, 10};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] ary = new int[n];
        for(int i = 0 ; i < n ; i++){

            st = new StringTokenizer(br.readLine());
            ary[i] = Integer.parseInt(st.nextToken());
        }

        solution(n , ary);
    }

    public static void solution(int n, int[] ary){

        int[] dp;

        for(int i = 0; i < n ; i++){

            dp = new int[ary[i] + 3];
            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 2;

            for(int j = 3; j <= ary[i]; j++){
                dp[j]  = dp[j - 1] + dp[j - 2] + dp[j - 3];
             }

            System.out.println(dp[ary[i]]);
        }

    }
}
