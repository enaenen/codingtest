/*

입력 A B C
출력 A+B*대수 < c 가 되는순간을 카운트

    https://www.acmicpc.net/problem/1712
    A는 고정비용
    B는 1대 당 생산비용
    C는 1대 책정 가격

    따라서
    A+B*대수 < c

 */
package space.baekjoon.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1712 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //고정비용
        int a = Integer.parseInt(st.nextToken());
        //노트북 1대 생산비용
        int b = Integer.parseInt(st.nextToken());
        //노트북 1대의 책정가격
        int c = Integer.parseInt(st.nextToken());
        int i=1;
        if(b>=c) System.out.println("-1");
        else {
            while (a/(c-b)>=i) {
                i++;
            }
            System.out.println(i);
        }
    }
}
