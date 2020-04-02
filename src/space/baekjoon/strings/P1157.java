/*
https://www.acmicpc.net/problem/1157
대소문자로 된 단어가 주어지면
단어에서 가장 많이 사용된 알파벳을 출력(대소문자를 구분하지않음)

입력
 영단어
출력
 가장 많이 사용된 알파벳을 대문자로 출력(동률일 경우 ?로 출력)

 String으로 입력받는다.
 char 배열로 변환
 [X]알파벳을 카운팅할 int 형 배열 생성(0~25) a~z
 HashMap 생성
 char 배열을 돌며 알파벳을 키, 밸류를 빈도수로 넣는데,
 만약 키가 이미 존재하면 빈도수++, 키가 없어서 null값이 반환되면 put(키,밸류)

 넣으면서 최대 밸류값 저장하여
 나중에 키를 기억해뒀다가 꺼내서 프린트


 입력받은 char 배열에서


  */
package space.baekjoon.strings;

import java.io.*;

public class P1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = br.readLine().toCharArray();
        boolean onlyOne=true;
        int[] countWord = new int[26];
        int min=0;
        char tmp='\0';

        for(char word : input){
            word=Character.toUpperCase(word);
            countWord[word-65]++;
            if(min<countWord[word-65]) {
                min = countWord[word - 65];
                tmp = word;
            }
            else if(min==countWord[word-65]){
                min = countWord[word - 65];
                tmp = '?';
            }
        }
        bw.write(tmp);
        bw.flush();
    }
}
