package jooeun.codingtest.스타트업코딩페스티벌2021;

public class Solution3 {

    static int[] answer;
    static char[][] shelf;

    public static void main(String[] args){

        // test case 1
        int n = 4;
        String[] space = {"1110", "1110", "0110", "0000"};

        // test case 2
//        int n = 5;
//        String[] space = {"11100", "00111", "01110", "01110", "01110"};

        solution(n, space);
    }

    public static void solution(int n, String[] space){

        answer = new int[n];
        shelf = new char[n][n];

        for(int i = 0; i < n ; i++)
            for(int j = 0 ; j < n; j++)
                shelf[i][j] = space[i].charAt(j);

        // 크기가 1*1 부터 직사각형의 최대 크기인 n*n 까지 돌기
        for(int i = 0; i < n ; i++)
            dfs(i,0 ,0, n);

        // 출력 포멧에 맞추어 출력
        int sum = 0;
        for(int i : answer)
            sum += i;

        System.out.println("total:" + sum);
        for(int i = 0 ; i < n; i++)
            if(answer[i] != 0)
                System.out.println("size[" + (i + 1) +"]:" + answer[i]);
    }

    public static void dfs(int size, int row, int column, int n){

        if(column == n){
            if(row == n){
                return ;
            }
            dfs(size, row + 1, 0, n);
        }

        // 다음 칸으로 갈 수 있는지 체크
        if(checkRange(row, column, n) && checkRange(row + size, column + size, n)){

            // 해당 범위내에 물건을 놓을 수 있는지?
            if(checkShelf(row, column, size))
                answer[size]++;
        }

        if(checkRange(row, column + 1, n + 1))
            dfs(size, row, column + 1, n);

    }

    // 선반이 비어져있는 경우 -> shelf == '1'
    private static boolean checkShelf(int row, int column,int size){

        for(int i = row; i <= row + size; i++){
            for(int j = column; j <= column + size; j++){

                // 해당하는 범위의 shelf 에 물건을 못놓는 경우 return false;
                if(shelf[i][j] == '0')
                    return false;
            }
        }
        return true;
    }

    private static boolean checkRange(int row, int column, int n){
        if((0 <= row && row < n) && (0 <= column && column < n))
            return true;
        else
            return false;
    }
}
