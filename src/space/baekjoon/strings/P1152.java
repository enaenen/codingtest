/*
https://www.acmicpc.net/problem/1152

입력 : 띄어쓰기로 구분된 문장

출력 : 문장에서 나오는 단어의 개수

띄어쓰기로 구분된 단어의 개수를 출력

 */
package space.baekjoon.strings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1152 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine()," ");
        bw.write(""+st.countTokens());
        bw.close();
    }
}
