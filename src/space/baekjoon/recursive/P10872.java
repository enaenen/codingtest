package space.baekjoon.recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10872 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial(n));

    }
    private static int factorial(int input){
        if(input==0) return 1;
        else {
            return (input * factorial(input - 1));
        }
    }
}
