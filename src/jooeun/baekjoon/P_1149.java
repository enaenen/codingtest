package jooeun.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1149

public class P_1149 {

//    static int min = Integer.MAX_VALUE;
//    static int n;
//    static int[][] ary;
//    static int[] colors;
//
//
//    public static void main(String[] args) throws IOException {
//
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        StringTokenizer st = new StringTokenizer(br.readLine());
////
////        n = Integer.parseInt(st.nextToken());
////
////        // {{26 40 83},{49 60 57},{13 89 99}}
////        ary = new int[n][3];
////        for(int i = 0 ; i < n ; i++){
////
////            st = new StringTokenizer(br.readLine());
////            for(int j = 0 ; j < 3; j++)
////                ary[i][j] = Integer.parseInt(st.nextToken());
////        }
//        n = 3;
//        ary = new int[][]{{26, 40, 83},{49, 60, 57},{13, 89, 99}};
//
//        colors = new int[n + 1];
//
//        solution(1, 0);
//
//        System.out.println(min);
//    }

    // 시간 초과
//    public static void solution(int k, int sum){
//
//        if(k == n +1){
//            for(int i : colors)
//                System.out.print(i + " ");
//
//            System.out.println(", sum : " + sum);
//            if(sum < min) {
//                min = sum;
//            }
//            return ;
//        }
//
//        switch (k){
//
//            case 1 :
//                colors[k] = 0;
//                solution(k +1, sum+ary[k - 1][0]);
//
//                colors[k] = 1;
//                solution(k+ 1, sum + ary[k - 1][1]);
//
//                colors[k] = 2;
//                solution(k + 1, sum + ary[k-1][2]);
//                break;
//            default:
//                switch (colors[k - 1]){
//                    case 0 :
//                        colors[k] = 1;
//                        solution(k+ 1, sum + ary[k - 1][1]);
//
//                        colors[k] = 2;
//                        solution(k + 1, sum + ary[k-1][2]);
//                        break;
//                    case 1 :
//                        colors[k] = 0;
//                        solution(k+ 1, sum + ary[k - 1][0]);
//
//                        colors[k] = 2;
//                        solution(k + 1, sum + ary[k-1][2]);
//                        break;
//                    case 2 :
//                        colors[k] = 0;
//                        solution(k +1, sum+ary[k - 1][0]);
//
//                        colors[k] = 1;
//                        solution(k+ 1, sum + ary[k - 1][1]);
//                        break;
//                }
//                break;
//        }
//    }

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(st.nextToken());
//
//        // {{26 40 83},{49 60 57},{13 89 99}}
//        int[][] ary = new int[n][3];
//        for(int i = 0 ; i < n ; i++){
//
//            st = new StringTokenizer(br.readLine());
//            for(int j = 0 ; j < 3; j++)
//                ary[i][j] = Integer.parseInt(st.nextToken());
//        }

        int n = 3;
        int[][] ary = new int[][]{{10, 11, 12},{9, 1000, 1000},{1000, 1000, 3}};

        System.out.println(solution(n, ary));
    }

    public static int solution(int n, int[][] ary){

        int[][] dp = new int[n][3];

        dp[0][0] = ary[0][0];
        dp[0][1] = ary[0][1];
        dp[0][2] = ary[0][2];

        for(int i = 1 ; i < n; i++){
            dp[i][0] = Math.min(dp[i - 1][1], dp[i-1][2]) + ary[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i-1][2]) + ary[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i-1][1]) + ary[i][2];

            for(int j = 0 ; j < 3; j++){
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println("\n");
        }

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println();
        }
        return Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]);
    }

//    public static int solution(int n, int[][] ary){
//
//        int[] sum = new int[n + 1];
//
//        int min = Integer.MAX_VALUE;
//        int before_color;
//
//        for(int i = 0; i < 3 ; i++){
//
//            sum[1] = ary[0][i];
//            before_color = i;
//
//            System.out.print(before_color + "  ");
//            for(int j = 2; j <= n; j++){
//
//                if(before_color == 0) {
//                    if(ary[j - 1][1] < ary[j - 1][2]){
//                        before_color = 1;
//                        sum[j] = sum[j - 1] + ary[j - 1][1];
//                    }else{
//                        before_color = 2;
//                        sum[j] = sum[j - 1] + ary[j - 1][2];
//                    }
//                    System.out.print(before_color + "  ");
//
//                }
//                else if(before_color == 1) {
//                    if(ary[j - 1][0] < ary[j - 1][2]){
//                        before_color = 0;
//                        sum[j] = sum[j - 1] + ary[j - 1][0];
//                    }else{
//                        before_color = 2;
//                        sum[j] = sum[j - 1] + ary[j - 1][2];
//                    }
//                    System.out.print(before_color + "  ");
//
//                }
//                else if(before_color == 2) {
//
//                    if(ary[j - 1][0] < ary[j - 1][1]){
//                        before_color = 0;
//                        sum[j] = sum[j - 1] + ary[j - 1][0];
//                    }else{
//                        before_color = 1;
//                        sum[j] = sum[j - 1] + ary[j - 1][1];
//                    }
//                    System.out.print(before_color + "  ");
//                }
//            }
//
//            System.out.println("/  " + sum[n]);
//            if(min > sum[n])
//                min = sum[n];
//
//            Arrays.fill(sum, 0);
//        }
//        return min;
//    }
}
