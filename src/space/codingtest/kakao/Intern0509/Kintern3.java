package space.codingtest.kakao.Intern0509;

public class Kintern3 {
        static int answer =999999;
        public static void main(String[] args){
            int[][] board =    {
                    {0, 0, 0, 0, 0, 0},
                    {0, 1, 1, 1, 1, 0},
                    {0, 0, 1, 0, 0, 0},
                    {1, 0, 0, 1, 0, 1},
                    {0, 1, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0, 0}};
            solution(board);
        }
        public static int solution(int[][] board){
            int nlen = board.length;
            int dir = 0;
            boolean[][] checkMap= new boolean[nlen][nlen];

            for(int i =0; i <nlen;i++){
                for(int j = 0; j<nlen;j++){
                    if(board[i][j] == 1){
                        checkMap[i][j] = false;
                    }
                    else{
                        checkMap[i][j] = true;
                    }
                }
            }

            DFS(board,checkMap, 0 , 0 , dir,0);


            System.out.println(answer);
            return answer;
        }
        public static void DFS(int[][] board, boolean[][] checkMap, int row, int col,int dir,int cost){
            checkMap[row][col] = false;
            if(row == (board.length)-1 && col == (board.length)-1){
                System.out.println(cost);
                if(cost < answer){
                    answer = cost;
                }
            }

            if(canGo(row-1, col , board.length , checkMap)){
                if(dir == 0 || dir == 1){
                    DFS(board,checkMap, row-1, col , 1,cost+100);
                }
                else{
                    DFS(board,checkMap, row-1, col , 1,cost+600);
                }
                checkMap[row-1][col] = true;
            }
            if(canGo(row, col+1, board.length , checkMap)){
                if(dir == 0 || dir == 2){
                    DFS(board,checkMap, row, col+1 , 2,cost+100);
                }
                else{
                    DFS(board,checkMap, row, col+1 , 2,cost+600);
                }
                checkMap[row][col+1] = true;
            }
            if(canGo(row+1, col, board.length , checkMap)){
                if(dir == 0 || dir == 3){
                    DFS(board,checkMap, row+1, col , 3,cost+100);
                }
                else{
                    DFS(board,checkMap, row+1, col , 3,cost+600);
                }
                checkMap[row+1][col] = true;
            }
            if(canGo(row, col-1, board.length , checkMap)){
                if(dir == 0 || dir == 4){
                    DFS(board,checkMap, row, col-1 , 4,cost+100);
                }
                else{
                    DFS(board,checkMap, row, col-1 , 4,cost+600);
                }
                checkMap[row][col-1] = true;
            }
            return;
        }
        public static boolean canGo(int row, int col,int length,boolean[][] checkMap){
            if(row < 0 || col <0 || row >= length || col >= length || checkMap[row][col] == false){
                return false;
            }
            return true;
        }
    }
