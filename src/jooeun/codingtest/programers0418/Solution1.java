package jooeun.codingtest.programers0418;

import java.util.*;

public class Solution1 {


    public static void main(String[] args){

        String p = "82195";
        String s = "64723";

        int answer = solution(p,s);

        System.out.println(answer);
    }

    static public int solution(String p, String s) {

        int num = p.length();
        int sum = 0;

        for(int i = 0 ; i < num ; i++){

            int now = p.charAt(i) - '0';
            int goal = s.charAt(i) - '0';

            if(now == goal) continue;

            int abs = Math.abs(now - goal);

            if(abs >= 5){

                sum += (10-abs);

            }else if(abs <  5){
                sum += abs;
            }


        }

        return sum;
    }

}
