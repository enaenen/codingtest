package jooeun.baekjoon;

import java.io.*;
import java.util.*;

public class P_1436 {

    static int n;
    static int answer=666;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        if(n > 1){
            dfs((int)Math.pow(10,3) + answer,1);
        }

        System.out.println(answer);
    }

    private static void dfs(int num,int k){

        String temp = num + "";

        if(temp.contains("666")){
            k +=1 ;
        }

        if( k == n){
            answer = num;
            return;
        }

        dfs(num +1 ,k);

    }
}
