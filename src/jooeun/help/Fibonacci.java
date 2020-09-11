package jooeun.help;

import java.io.*;

public class Fibonacci {

    public static void main(String[] args)throws IOException {

        System.out.print( " 정수 n 입력 : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long answer = dfs(n);

        System.out.println("피보나치 수열의 "+ n + "번째 수는 " + answer);
    }

    // 0 1 1 2 3 5 8 13 21 34 55 ...
    //         .
    public static long dfs(int n){

        if(n <=1 ){
            return n;
        }

        return dfs(n-2) + dfs(n-1);
    }

}
