package space.baekjoon.dp;
/**
 * D[n] = D[n-1]+D[n-2]
 */

import java.util.Scanner;

public class P11726_1 {
    private static int[] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new int[n+1];

    }
    public static int method(int n){
        if(n==0) return 0;

        return memo[n];
    }
}
