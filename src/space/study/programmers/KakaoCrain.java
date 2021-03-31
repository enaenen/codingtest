package space.study.programmers;

import java.util.Stack;

public class KakaoCrain {
    public static void main(String[] args) {
        System.out.println("result = " +
                solution(new int[][]{
                                {0, 0, 0, 0, 0},
                                {0, 0, 1, 0, 3},
                                {0, 2, 5, 0, 1},
                                {4, 2, 4, 4, 2},
                                {3, 5, 1, 3, 1}},

                        new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<Integer>();
        for (int i = 0; i < moves.length; i++) {
            int x = moves[i]-1;
            for (int j = 0; j < board.length; j++) {
                if(board[j][x]==0)
                    continue;
                if(basket.empty())
                    basket.push(board[j][x]);
                else if(basket.peek()==board[j][x]){
                    basket.pop();
                    answer++;
                }
                else {
                    basket.push(board[j][x]);
                }
                board[j][x]=0;
                break;
            }
        }
        return answer*2;
    }
}
