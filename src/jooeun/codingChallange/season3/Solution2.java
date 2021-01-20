package jooeun.codingChallange.season3;

import java.util.ArrayList;

public class Solution2 {

    public static void main(String[] args){

        String s = "110010101001";

        int[] answer = solution(s);

        for (int i : answer){
            System.out.print(i + "   ");
        }
    }

    static public int[] solution(String s) {

        int[] answer = {0,0};

        ArrayList<Integer> to_2;
        int cnt_0;
        int len;

        while(!s.equals("1")){

            cnt_0 = 0;
            answer[0]++;
            len = s.length();

            for(int i = 0 ; i < len; i++){

                if(s.charAt(i) == '0'){
                    cnt_0++;
                }

            }

            answer[1] += cnt_0;

            to_2 = new ArrayList<Integer>();
            len -= cnt_0;

            s = "";

            if(len == 1){
                s = "1";
            }else{

                while(len >= 1){
                    to_2.add(0,len%2); //1000
                    len /= 2;
                }

                for(int i = 0 ; i < to_2.size(); i++){

                    s += to_2.get(i);

                }

            }

        }

        return answer;
    }
}

//            2 | 6
//            2 | 3 ...0
//            2 | 1 ...1
//            --> 110
//
//            2 | 3
//            2 | 1 ...1
//            --> 11
//
//            2 | 7
//            2 | 3 ...1
//            2 | 1 ...1
//            --> 111
//
//            2 | 8
//            2 | 4 ...0
//            2 | 2 ...0
//            2 | 1 ...0
//            --> 1000
