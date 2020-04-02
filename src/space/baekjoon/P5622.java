
/*
https://www.acmicpc.net/problem/5622

입력 : 알파벳 대문자
ABC =2
DEF =3
GHI =4
JKL =5
MNO =6
PQRS =7
TUV =8
WXYZ=9
걸리는 시간은
출력 : 다이얼을 누르는데 걸리는 총 시간은 다이얼+1

각 알파벳의 순서 / 3 +3을 하면 걸리는 시간이 된다.
PQRS에서 4개가 되어
그 뒤로 S,V,Y,Z는 3으로 나누었을때 +1이 되므로
 예외처리 하여 1초씩 깎아준다.

 */
package space.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5622 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int time = 0;
        for (char alphabet : input) {
            time += ((alphabet - 65) / 3) + 3;
            if (alphabet == 'S' || alphabet=='V' || alphabet == 'Y' ||alphabet == 'Z') time--;
        }
        System.out.println(time);
    }
}
