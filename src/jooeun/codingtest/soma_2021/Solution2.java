package jooeun.codingtest.soma_2021;

public class Solution2 {

    public static void main(String[] args){
        int p = 2;
        int n = 7;
        int h = 4;
        int[][] reservations = {{1,10}, {1, 5}, {1, 7}, {2, 10}, {2, 1}, {2, 3}, {2, 7}};

        int [][] answer = solution(p, n , h ,reservations);

        for(int[] payment : answer){

            for(int i : payment){
                System.out.print(i + "   ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int p, int n, int h, int[][] reservations){

        int[][] answer = new int[p][2];
        int row = 0;
        int pc_num = 1;
        int[ ]max_payment = new int[p];

        while(row < reservations.length){

            if(reservations[row][0] == pc_num){

                if(reservations[row][1] > max_payment[pc_num -1] && reservations[row][1] <= h)
                    max_payment[pc_num - 1] = reservations[row][1];

                row++;
            }else  pc_num++;
        }

        for(int i = 0 ; i < p ; i++){
            answer[i][0] = i + 1;
            answer[i][1] = max_payment[i] * 1000;
        }

        return answer;
    }

}
