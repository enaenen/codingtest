/*
https://www.acmicpc.net/problem/10809

입력 : 단어 (String)
출력 : a~z까지
몇번째 자리에 존재하는지 공백으로 구분하여 출력

ascii : a 97 ~ z 122까지
 */
package space.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10809 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word=br.readLine().toCharArray();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for(int i=0;i<word.length;i++){
            if(alphabet[word[i]-97]==-1) alphabet[word[i]-97]=i;
        }

        for(int output : alphabet){
            System.out.print(output);
            System.out.print(" ");
        }
    }
}
