package jooeun.codingChallange.season1;

import java.util.*;

public class Solution2 {

    static int[][] map = new int[1000][1000];
    static int box;

    public static void main(String[] args){

        int n = 5;
        int[] answer = solution(n);

        for(int i : answer){

            System.out.print(i + "    ");

        }

    }

    static public int[] solution(int n) {

        //짝수
        if( n%2 == 0 ){
            box = (1 + n)*(n/2);
        }
        //홀
        else{
            box = (1+n)*(n/2) + (1+n)/2;
        }


        int cnt = 1;

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{1,0});
        list.add(new int[]{0,+1});
        list.add(new int[]{-1,-1});

        for(int i = 0; i < n ; i++){
            map[i][0] = cnt;
            cnt += 1;
        }

        int step = n;
        int remains = step;
        int status = 1;
        int i = n -1;
        int j = 0;


        while(cnt <= box){

            System.out.println("status : " + status);

            if(remains == 1){
                step -= 1;
                remains = step;

                switch (status){
                    case 0 : status = 1; break;
                    case 1 : status = 2; break;
                    case 2 : status = 0; break;
                }

            }else{

                i += list.get(status)[0];
                j += list.get(status)[1];
                map[i][j] = cnt;

                cnt += 1;
                remains -=1;

                System.out.println("i : " + i + "   , j : " + j);
                System.out.println("MAP[i][j]" + map[i][j]);

            }

        }

        int[] answer = new int[box];

        int idx = 0;

        for(int k = 0 ; k < n ; k++){
            for(int l = 0; l <= k; l++){
                answer[idx++] = map[k][l];
            }
        }

        return answer;
    }


}
