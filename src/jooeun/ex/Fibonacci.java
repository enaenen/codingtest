package jooeun.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){

        // fibonacci 예시
        // 1 1 2 3 5 8 13 21
        // 1 + 1 = 2
        // 1 + 2 = 3 -> 1 + (1 + 1) = 3
        // 2 + 3 = 5 -> (1 + 1) +  1 + (1 + 1) = 5
        // 3 + 5 = 8 ->

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//        int fibonacci = dsp(0 , 1, 1 , n);
        int[] ary = new int[n+1];
        Arrays.fill(ary, 0);

        int fibonacci = dp(ary, n);

        System.out.println("Fibonacci : " + fibonacci);
        scanner.close();
    }

    // 재귀함수
    public static int dsp(int num, int fibonacci, int now ,int n){

        if(now == n){
            return fibonacci;
        }

        return dsp(fibonacci, num + fibonacci, now + 1, n);
    }

    // dp 버전
    public static int dp(int[] ary,int n){

        for(int i = 0 ; i <= n ; i++){

            if(i == 0 ){

                ary[i] = 0;

            }else if(i == 1){

                ary[i] = 1;

            }else{

                ary[i] = ary[i -2] + ary[i -1];

            }

        }

        return ary[n];
    }

}
