package jooeun.baekjoon;

import java.io.*;
import java.util.*;

public class P_1018 {

    static int col;
    static int row;
    static int s_col;
    static int s_row;

    static char[][] map;
    static int[][] checked;
    static int answer = Integer.MAX_VALUE;
    static int cnt = 0;

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());

        map = new char[col][row];
        checked = new int[col][row];

        for(int i = 0 ; i < col ; i++){
            st = new StringTokenizer(br.readLine());
            map[i] = (st.nextToken()).toCharArray();
        }

        for(int i = 0 ; i <= col - 8; i++){

            s_col = i;

            for(int j = 0 ; j <= row - 8; j++){

                cnt = 0;
                s_row = j;

                initChecked();

                switch (map[s_col][s_row]){
                    case('B') : dfs(s_col,s_row,'W'); break;
                    case('W') : dfs(s_col,s_row,'B'); break;
                    default: break;
                }

                if(cnt < answer)
                    answer = cnt;

            }
        }

        System.out.println(answer);

    }

    //행, 열, 비교해야 하는 블록 색상
    private static void dfs(int col, int row,char com_block){

        checked[col][row] = 1;

        char next_block = 'U';

        switch (com_block){
            case ('B') : next_block = 'W'; break;
            case ('W') : next_block = 'B'; break;
            default: break;
        }

        //up
        if(checkRange(col - 1, row) && checked[col - 1][row] == 0){
            if(map[col-1][row] != com_block)
                cnt++;
            dfs(col -1,row, next_block);

        }

        //down
        if(checkRange(col + 1, row) && checked[col + 1][row] == 0){
            if(map[col+1][row] != com_block)
                cnt++;
            dfs(col +1,row, next_block);
        }

        //left
        if(checkRange(col, row - 1) && checked[col][row - 1] == 0){
            if(map[col][row-1] != com_block)
                cnt++;
            dfs(col,row -1, next_block);
        }

        //right
        if(checkRange(col, row + 1) && checked[col][row + 1] == 0){
            if(map[col][row+1] != com_block)
                cnt++;
            dfs(col,row+1, next_block);
        }

    }

    private static void initChecked(){
        for(int i = s_col ; i < s_col + 8 ; i++){
            for(int j = s_row ; j < s_row + 8 ; j++){
                checked[i][j] = 0;
            }
        }
    }

    private static boolean checkRange(int col, int row){
        if( (s_col <= col && col < s_col + 8) && (s_row <= row && row < s_col + 8 ) )
            return true;

        return false;
    }

}
