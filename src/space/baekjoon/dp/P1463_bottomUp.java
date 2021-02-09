package space.baekjoon.dp;

import java.util.Scanner;

public class P1463_bottomUp {
    private static int[] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new int[n+1];

        for(int i=2; i<=n; i++){
            memo[i]=memo[i-1]+1;
            if(i%2==0 && memo[i] > memo[i/2] + 1)
              memo[i]=memo[i/2] + 1;
            if(i%3==0 && memo[i] > memo[i/3] + 1)
                memo[i]=memo[i/3]+1;
        }
        System.out.println(memo[n]);
    }
}
