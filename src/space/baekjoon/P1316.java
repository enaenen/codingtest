package space.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int words = Integer.parseInt(br.readLine());
        int count = words;
        while (words-- > 0) {

            char[] wordArray = br.readLine().toCharArray();
            //a~z 까지 한번 본적이 있다면 true 로 체크
            boolean[] continues = new boolean[26];
            //0번은 미리 true
            continues[wordArray[0]-97]=true;
            //입력받은 단어검사
            for (int i = 1; i < wordArray.length; i++) {
                // 이 전 char 와 일치하고, 현재 검사하는 단어가 이미 나왔떤 단어이면 카운트를 깎는다.
                if (!(wordArray[i - 1] == wordArray[i]) && continues[wordArray[i]-97]) {
                    count--;
                    break;
                }
                continues[wordArray[i] - 97] = true;
            }

        }
        System.out.println(count);
    }
}
