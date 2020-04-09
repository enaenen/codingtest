/*
피보나치 수열 출력(재귀)
F(1)=1
F(n)=F(n-1)+F(n-2)
F(5) = 5

F(5) = F(3)+F(4)
     (1+1) + (1+ 1+1)

F(4) = f(2)+f(3)
        (1+)(1+1)

F(3) = F(1)+f(2)
        (1)+(1)

F(2)=F(0)+F(1)
      0 + 1

F(1)<=1


 */
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
