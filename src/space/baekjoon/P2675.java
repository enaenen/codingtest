/*
    https://www.acmicpc.net/problem/2675

    입력 :
            TC수(1<=T<=1000)
            반복횟수 R(1<=R<=8) 문자열S

            S의 길이는 최소1이상 최대20 이하
 */
package space.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2675 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tc=Integer.parseInt(br.readLine());

        while(tc-->0){
            st = new StringTokenizer(br.readLine(), " ");
            int R= Integer.parseInt(st.nextToken());
            char[] words = st.nextToken().toCharArray();

            for(char w : words){
                for(int i=0;i<R;i++){
                    System.out.print(w);
                }
            }
            System.out.println();
        }
    }
}
