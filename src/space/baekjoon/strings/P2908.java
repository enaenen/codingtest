/*
https://www.acmicpc.net/problem/2908

입력 : 두개의 수
출력 : 둘 중 숫자를 뒤집었을때 더 큰 수

두 수는 같지않은 세자리 수
0이 포함되어있지 않다.

 */
package space.baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int biggerNum=0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            int multiplier = 100;
            int outputNumber=0;
            int revesedNum=0;

            revesedNum += num/multiplier;

            num %= multiplier;
            multiplier /= 10;

            revesedNum+=(num/multiplier)*multiplier;

            num %= multiplier;

            revesedNum += num*multiplier*multiplier;


            if (biggerNum<outputNumber){
                biggerNum=outputNumber;
            }
        }
        System.out.println(biggerNum);
    }
}
