package space.baekjoon.recursive;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2448re {
    public static int n;
    public static char[][] board;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new char[n][n*2];
        drawStar(n-1,0,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n*2;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    private static void drawStar(int x, int y, int n){
        if(n==3){
            board[y][x]='*';

            board[y+1][x-1]=board[y+1][x+1]='*';

            board[y+2][x-2]= board[y+2][x-1]= board[y+2][x]= board[y+2][x]= board[y+2][x+1]= board[y+2][x+2]
                    ='*';

            return;
        }
        drawStar(x,y,n/2);
        drawStar(x+(n/2),y+(n/2),n/2);
        drawStar(x-(n/2),y+(n/2),n/2);
    }
}
