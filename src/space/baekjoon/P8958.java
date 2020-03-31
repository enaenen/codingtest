/*
https://www.acmicpc.net/problem/8958
입력 :
tc 수
OOXXOXXOOO

출력:
각 OX 퀴즈의 점수

조건 :
O가 연속될때마다 1점씩 올라가고 X를 만나면 1점으로 초기화된다.

 */
package space.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P8958 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        while(tc-->0){
            char[] scoreBoard = br.readLine().trim().toCharArray();

            System.out.println(Integer.toString(check(scoreBoard)));
        }
    }
    public static int check(char[] scoreBoard){
        int score=0;
        int continuity=1;
        for(char answer : scoreBoard){
            if(answer=='O') score+=continuity++;
            else continuity=1;
        }
        return score;

    }
}
