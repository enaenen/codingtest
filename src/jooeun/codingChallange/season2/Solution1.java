package jooeun.codingChallange.season2;

import java.util.ArrayList;

public class Solution1 {

    public static void main(String[] args){

        int n = 45;
        int answer = solution(n);

//        System.out.println(answer);

    }

    static public int solution(int n){

        int answer = 0;
        int target = n;
        int temp = 0;

        ArrayList<Integer> remainder = new ArrayList<Integer>();

        while(temp != 1){

            temp = target/3;
            remainder.add(target%3);
            target = temp;

        }

        System.out.println(remainder);

        return answer;
    }

}
