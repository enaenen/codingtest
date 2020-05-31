///*
//https://www.acmicpc.net/problem/11053
//가장 긴 증가하는 부분수열
// */
//package space.baekjoon.dp;
//
//import jdk.internal.util.xml.impl.Input;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class P11053 {
//    private static int[] dp = new int[1001];
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] input=new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        for(int i =0;i<n;i++) {
//            input[i]=Integer.parseInt(st.nextToken());
//        }
//
//        dp[0]=1;
//        for(int i=0;i<n;i++){
//            int max = 0;
//            for(int j=i-1;j>=0;j--){
//                if(input[i]>input[j]){
//                    max =
//                }
//            }
//        }
//    }
//}
