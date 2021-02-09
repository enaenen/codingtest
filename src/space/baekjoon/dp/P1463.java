package space.baekjoon.dp;

import java.util.Scanner;

public class P1463 {
    private static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new int[n+1];
        System.out.println(makeOne(n));
    }
    public static int makeOne(int n){
        if(n==1) return 0;
        if(memo[n]>0) return memo[n];
        memo[n]=makeOne(n-1) + 1;
        if(n%2==0){
            int tmp = makeOne(n/2)+1;
            if(memo[n]>tmp) memo[n]=tmp;
        }
        if(n%3==0){
            int tmp = makeOne(n/3)+1;
            if(memo[n]>tmp) memo[n]=tmp;
        }
        return memo[n];
    }

}
