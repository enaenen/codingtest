package jooeun.baekjoon;

import java.io.*;
import java.util.*;

public class P_11720 {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        char[] ary = st.nextToken().toCharArray();

        int answer = 0;

        for(char c : ary){
            answer += (c-'0');
        }

        System.out.println(answer);
    }

}
