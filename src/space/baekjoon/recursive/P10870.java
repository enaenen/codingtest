package space.baekjoon.recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10870 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println(fibo(input));

    }
    private static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
