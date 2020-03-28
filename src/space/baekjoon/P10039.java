package space.baekjoon;
/*
https://www.acmicpc.net/problem/10039

입력 : 5명 학생의 점수
출력 : 5명의 평균 점수

40점 미만일때는 40점으로 고정
입력되는 평균점수는 5의 배수 -> 점수는 항상 정수

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10039 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int avg=0;
        for(int i=0;i<5;i++){
            int score = inputScore(Integer.parseInt(br.readLine()));
            avg += score;
        }
        System.out.println(avg/5);


        return;
    }
    private static int inputScore(int num){
        if(num < 40){
            return 40;
        }
        else
            return num;
    }
}
