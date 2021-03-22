package jooeun.baekjoon;

// Dynamic Programming (기억해서 풀기)
// https://www.acmicpc.net/problem/11726
public class P_11726 {

    public static void main(String[] args){

        int n = 9;

        System.out.println(solution(n));
    }

    //top -> down : 하향식
//    public static int solution(int n) {
//
//        int[] dp = new int[n + 3];
//        dp[0] = 1;
//        dp[1] = 1;
//
//        for (int i = 2; i <= n; i++){
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//
//        return dp[n];
//    }

    // down -> top : 상향식
    public static int solution(int n){

        int[] dp = new int[n+3];
        dp[1] = 1;
        dp[2] = 1;

        for(int i = 0 ; i <= n ; i++){

            dp[i + 1] += dp[i];
            dp[i + 2] += dp[i];

            System.out.println((i+1) +" "+(i+2)+"/ "+dp[i+1]+" "+dp[i+2]);
        }

        return dp[n];
    }

}
