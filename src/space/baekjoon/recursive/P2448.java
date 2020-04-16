/*
https://www.acmicpc.net/problem/2448

별 찍기 - 11


 */
package space.baekjoon.recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2448 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] board = new char[n][n*2];
        star(board, n, n-1, 0);
        for(int i=0;i<n;i++){
            for(int j=0;j<n*2;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    private static void star(char[][] board, int n, int x, int y){
        if(n==3){
            //별 그려주기
            board[y][x]='*';

            board[y+1][x-1]='*';
            board[y+1][x+1]='*';

            board[y+2][x-2]='*';
            board[y+2][x-1]='*';
            board[y+2][x]='*';
            board[y+2][x+1]='*';
            board[y+2][x+2]='*';
            return;
        }
        //위에있는별
        star(board,n/2,x,y);
        //두번째 별(왼쪽)
        star(board,n/2,x+(n/2),y+(n/2));
        //두번째 별(오른쪽)
        star(board,n/2,x-(n/2),y+(n/2));
    }
}
