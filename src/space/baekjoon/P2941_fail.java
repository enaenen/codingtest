/*
https://www.acmicpc.net/problem/2941

입력 : 크로아티아 알파벳
출력 : 크로아티아 알파벳의 개수

특이한점
알파벳 뒤에 =, -가 들어가는 알파벳은 char 2개를 입력받아도 하나로 카운팅해야한다.
nj, lj , dz= 가 하나의 글자로 인식되어야한다.

lj 와 nj를 일반j와 구분해야한다.

 */
package space.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2941_fail {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int counter=0;

        counter++;
        char check;
        for(int i=1;i<input.length;i++){
            check=input[i-1];
            counter++;

            //뭔가 예외 조건을 만드는데 dz= 와 z= 구분이 안된다.
            if(input[i]=='j' && (check=='n' || check=='l')) counter --;
            if(input[i]=='-'||input[i]=='=') {
                counter--;
            }
        }
        System.out.println(counter);

    }
}
