package space.baekjoon.codeplus.math.gcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
유클리드 호제법
GCD(A,B) = GCD(B,A%B)
 */
public class BJ9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());

        while(cases-->0) {
            long gcdTotal=0;
            String[] inputs = br.readLine().split(" ");
            int numbers = Integer.parseInt(inputs[0]);
            int[] inputNumbers= new int[numbers];
            for(int i=0;i<numbers;i++){
                inputNumbers[i]=Integer.parseInt(inputs[i+1]);
            }
            for(int i=0;i<inputNumbers.length;i++){
                for(int j=i+1;j<inputNumbers.length;j++){
                    gcdTotal+=gcd(inputNumbers[i],inputNumbers[j]);
                }
            }
            System.out.println(gcdTotal);
        }

    }
    static int gcd(int a, int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
