package jooeun.codingtest.programers0418;

public class Solution2 {

    static char direction = 'n';

    static public void main(String[] args){

        int[][] office = new int[][]{{5,-1,4},{6,3,-1},{2,-1,1}};
        String[] move = new String[]{"go","go","right","go", "right","go","left","go"};
        int r = 1;
        int c = 0;

        int res = solution(office,r,c,move);

        System.out.println(res);

    }

    static public int solution(int[][] office, int r, int c, String[] move) {

        int answer = office[r][c];
        int len = move.length ;

        int row = r;
        int col = c;

        for(int i = 0 ; i < len ; i++){

            row = r;
            col = c;

            if(move[i].equals("right")){

                switch (direction){
                    case ('n'): direction = 'e'; col += 1; break;
                    case ('e'): direction = 's'; row += 1; break;
                    case ('w'): direction = 'n'; row -= 1; break;
                    case ('s'): direction = 'w'; col -= 1; break;
                }

            }else if(move[i].equals("left")) {

                switch (direction){
                    case ('n'): direction = 'w'; col -= 1; break;
                    case ('e'): direction = 'n'; row += 1; break;
                    case ('w'): direction = 's'; row += 1; break;
                    case ('s'): direction = 'e'; col += 1; break;
                }


            }
            //go
            else{

                switch (direction){
                    case ('n'): row -= 1; break;
                    case ('e'): col += 1; break;
                    case ('w'): col -= 1; break;
                    case ('s'): row += 1; break;
                }

            }


            System.out.println(row + "  " +  col + "  " +  answer);

            if(office[row][col] != -1){
                r = row;
                c = col;
                answer += office[r][c];
            }

        }

        return answer;
    }
}
