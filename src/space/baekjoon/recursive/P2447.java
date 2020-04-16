/*
https://www.acmicpc.net/problem/2447

 */
package space.baekjoon.recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2447 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] board = new char[n][n];
        star(board, n, 0,0);

    }
    private static void star(char[][] board, int n, int x, int y){
//
//        star(board, )
    }
}
