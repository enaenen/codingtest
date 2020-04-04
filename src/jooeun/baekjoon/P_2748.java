package jooeun.baekjoon;

import java.io.*;
import java.util.*;

public class P_2748 {

    static long n;

    public static void main(String[] args) throws IOException{

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        if(n >= 2){
            System.out.println(dfs(2, 0, 1));
        }else{
            System.out.println(n);
        }

    }

    private static long dfs(int k, long num1, long num2){

        if(k == n)
            return num1 + num2;

        return dfs(k+1, num2,num1 + num2);

    }

}
