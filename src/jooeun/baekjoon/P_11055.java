package jooeun.baekjoon;

import java.util.Arrays;

public class P_11055 {

    public static void main(String[] args){

        int[] ary = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8};
        int n = ary.length;
        System.out.println("ANSWER : " + solution(ary, n) );
    }

    public static int solution(int[] ary, int len){

        int max = 0;
        int[] dp = new int[ary.length];

        for(int i = 0; i < ary.length; i++){

            dp[i] = ary[i];

            for(int j = 0; j < i; j++){

                 if((ary[j] < ary[i]) && (dp[j] < dp[j] + ary[i])){
                     dp[i] = dp[j]+ ary[i];
                 }

                 if(max < dp[i]){
                     max = dp[i];
                 }

            }

        }

        return max;
    }

}
