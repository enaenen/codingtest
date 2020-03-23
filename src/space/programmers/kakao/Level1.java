package space.programmers.kakao;

public class Level1 {
    public static void main(String[] args) {
        int res =  solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},
                {4,2,4,4,2},{3,5,1,3,1}}, new int[] {1,5,3,5,1,2,1,4});
        System.out.println(res);
    }
    public static int solution(int[][] board, int[] moves) {
        int boardSize = board.length;
        int movesSize = moves.length;
        int resultSize = 0;
        int[] result = new int[movesSize];

        int answer = 0;

        for(int i=0; i< movesSize ; i++){
            int cnt = moves[i]-1;
            for(int j=0; j<boardSize;j++){
                if(board[j][cnt] != 0) {
                    result[resultSize++] = board[j][cnt]; //담은뒤에
                    //resultSize++;   //크기를 올린다
                    board[j][cnt]=0;  //확실
                    if(resultSize != 1 && result[resultSize-2] == result[resultSize-1]){
                        result[resultSize-2] = 0;
                        result[resultSize-1] = 0;
                        resultSize -= 2;
                        answer++;
                    }
                    break;
                }
            }
        }
        answer*=2;
        return answer;
    }
}
