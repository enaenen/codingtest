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
        br.close();

        char[][] board = new char[n][n];
        star(board, n, 0,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }
    private static void star(char[][] board, int n, int x, int y){
        if(n==1){
            board[y][x]='*';
            return;
        }
        star(board,n/3,x,y); //상좌
        star(board,n/3,x+n/3,y);//상중
        star(board, n/3,x+n/3*2,y);//상우

        star(board,n/3,x,y+n/3);//중좌
        star(board,n/3,x+n/3*2,y+n/3);//중우

        star(board,n/3,x,y+n/3*2);//하좌
        star(board, n/3,x+n/3,y+n/3*2);// 하중
        star(board, n/3,x+n/3*2, y+n/3*2);//하우
    }
}
